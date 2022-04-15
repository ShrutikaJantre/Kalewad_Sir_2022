

class MyThread extends Thread{

	public void run(){
		for(int i=0; i<20; i++){
			System.out.println(i+" -> "+Thread.currentThread().getName());
			
			
		}
		
	}
}

class ThreadDemo1{

	public static void main(String[] args){
		
		System.out.println(Thread.currentThread().getName()+" Started");//Main or main
		MyThread t1 = new MyThread();//New State//Main thread executes them all
		t1.setName("T1");
		MyThread t2 = new MyThread();//New State
		t2.setName("T2");
		MyThread t3 = new MyThread();//New State
		t3.setName("T3");
		MyThread t4 = new MyThread();//New State
		t4.setName("T4");
		System.out.println(Thread.currentThread().getName()+" Starting Thread");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		/*while(true){
			System.out.println(Thread.currentThread().getName()+" still alive!!");//Main or main
		}*/
		
		System.out.println(Thread.currentThread().getName()+" Ended");
		
	
	}

}//how to share common task in multiple threads