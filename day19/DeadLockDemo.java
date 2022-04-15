
class DeadLockDemo{
	synchronized void m1(){
		
		
	}
	
	synchronized void m2(){
		
		
		
	}
	public static void main(String[] args){
	
		DeadLockDemo d1 = new DeadLockDemo();
		DeadLockDemo d2 = new DeadLockDemo();
		
		Thread t1 = new Thread(){
			public void run(){
				synchronized (d1){
					System.out.println("Got d1 ka lock");
					d1.m1();
					try{Thread.sleep(10);}catch(InterruptedException e){}
					System.out.println("Waiting for d2 ka lock");
					synchronized(d2){
						System.out.println("Milgaya d2 ka lock");
					}
				}	
			}
		};	
		
		Thread t2 = new Thread(){
			public void run(){
				synchronized (d2){
					System.out.println("Got d2 ka lock");
					d1.m1();
					try{Thread.sleep(10);}catch(InterruptedException e){}
					System.out.println("Waiting for d1 ka lock");
					synchronized(d1){
						System.out.println("Milgaya d2 ka lock");
					}
				}	
			}
		};	
		
		t1.start();
		try{Thread.sleep(20);}catch(InterruptedException e){}
		
	}
}