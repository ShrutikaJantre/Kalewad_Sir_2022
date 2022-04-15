import java.util.ArrayList;

class Stock{

	static ArrayList<Integer> list = new ArrayList<>();
	final static int MAX_SIZE = 10;
	final static int MIN_SIZE = 0;
	
	
	
}

class Producer implements Runnable{
	@Override
	public void run(){
		int num =1;
		while(true){
			produce(num++);
			try{Thread.sleep(100);}catch(InterruptedException e){}
		}
		
	}
	
	void produce(int value){
		synchronized(Stock.list){
			if(Stock.list.size() == Stock.MAX_SIZE){
				System.out.println("Producer Waiting..!!" +Stock.list.size());
				try{Stock.list.wait();}catch(InterruptedException e){}				
			}
			System.out.println("Producing... "+value);
			Stock.list.add(value);
			Stock.list.notify();
		}
		
	}
}

class Consumer implements Runnable{
	@Override
	public void run(){
		while(true){
			consume();
			try{Thread.sleep(100);}catch(InterruptedException e){}
		}
	}
	
	void consume(){
		//synchronized(Stock.list){
			if(Stock.list.size() == Stock.MIN_SIZE){
				System.out.println("Consumer waiting... "+Stock.list.size());
				try{Stock.list.wait();}catch(InterruptedException e){}// Thread will enter wait state but after releasing lock on Stock.list
			}
			int value = Stock.list.get(0);
			Stock.list.remove(0);
			System.out.println("Consuming... "+value);
			Stock.list.notify();
		//}
	}
}
class PCDemo{

	public static void main(String[] args) throws InterruptedException{
		Producer p = new Producer();
		Consumer c = new Consumer();
		
		Thread pro = new Thread(p, "Producer");
		Thread con = new Thread(c, "Consumer");
		
		pro.start();
		Thread.sleep(10000);
		con.start();
		
	}
}