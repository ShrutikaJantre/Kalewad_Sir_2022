
class Run1 implements Runnable{
	@Override
	public void run(){
		System.out.println(Thread.currentThread().getName()+" Started");
		for(int i=1; i<=10; i++){
			
			System.out.println(" Run1 thread " +Thread.currentThread().getName());
				
		}
		System.out.println(Thread.currentThread().getName()+" Ended");	
	}

}

class Run2 implements Runnable{
	@Override
	public void run(){
		System.out.println(Thread.currentThread().getName()+" Started");
		for(int i=1; i<=10; i++){
			
			System.out.println(" Run2 thread " +Thread.currentThread().getName());
				
		}
		System.out.println(Thread.currentThread().getName()+" Ended");	
	}

}

class Run3 implements Runnable{
	@Override
	public void run(){
		System.out.println(Thread.currentThread().getName()+" Started");
		for(int i=1; i<=10; i++){
			
			System.out.println(" Run3 thread " +Thread.currentThread().getName());
				
		}
		System.out.println(Thread.currentThread().getName()+" Ended");	
	}

}


class RunnableDemo2{
	public static void main(String[] args){
		System.out.println(Thread.currentThread().getName()+" Started");
		
		Run1 r1 = new Run1();
		Thread t1 = new Thread(r1, "Thread 1");//thread and runnable ko bind kar rahe hai
		t1.start();
		
		Run2 r2 = new Run2();
		Thread t2 = new Thread(r2, "Thread 2");
		t2.start();
		
		Run3 r3 = new Run3();
		Thread t3 = new Thread(r3, "Thread 3");
		t3.start();
		
		
		System.out.println(Thread.currentThread().getName()+" Ended");
	}

}