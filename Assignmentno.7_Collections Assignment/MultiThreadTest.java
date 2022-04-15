class MyRunnable implements Runnable{
	int a;
	MyRunnable(int a){
	this.a = a;
	}
	public void run(){
		for(int i=1; i<=10; i++){
		System.out.println(a+" x "+i+" = "+(a*i));
		}
		System.out.println();
	}	

}

class MultiThreadTest{
	
	public static void main(String args[]){
		
	MyRunnable r1 = new MyRunnable(12);
	MyRunnable r2 = new MyRunnable(15);
	Thread t1 = new Thread(r1);
	Thread t2 = new Thread(r2);
	t1.start();
	try{Thread.sleep(5000);}catch(InterruptedException e){}
	t2.start();
	}

}