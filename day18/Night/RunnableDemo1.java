
class Run implements Runnable{
	@Override
	public void run(){
		System.out.println(Thread.currentThread().getName()+" Started");
		for(int i=1; i<=10; i++){
			
			System.out.println(" Run thread " +Thread.currentThread().getName());
				
		}
		System.out.println(Thread.currentThread().getName()+" Ended");	
	}

}


class RunnableDemo1{
	public static void main(String[] args){
		System.out.println(Thread.currentThread().getName()+" Started");
		
		Run r1 = new Run();
		Thread t1 = new Thread(r1, "Thread 1");//thread and runnable ko bind kar rahe hai
		t1.start();
		
		Run r2 = new Run();
		Thread t2 = new Thread(r2, "Thread 2");
		t2.start();
		
		System.out.println(Thread.currentThread().getName()+" Ended");
	}

}