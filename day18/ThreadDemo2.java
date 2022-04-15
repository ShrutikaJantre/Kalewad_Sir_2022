class AddThread extends Thread{

	public void run(){
		System.out.println(Thread.currentThread().getName()+" Started");
		int sum = 0;
		for(int i=0; i<20; i++){
			sum = sum + i;
		}
		System.out.println("sum: "+sum+" " +Thread.currentThread().getName()+" Ended");
	}
}
class MultiThread extends Thread{
	public void run(){
		System.out.println(Thread.currentThread().getName()+" Started");
		int res = 1;
		
		for(int i=1; i<10; i++){
			res = res * i;
		}
		System.out.println("res: "+res+" "+Thread.currentThread().getName()+" Ended");
	}
}	


class ThreadDemo2{

	public static void main(String[] args){
		System.out.println(Thread.currentThread().getName()+" Started");
		
		AddThread at = new AddThread();
		at.setName("Add-Thread");
		
		MultiThread mt = new MultiThread();
		mt.setName("Multi-Thread");
		
		at.start();
		mt.start();
		
	Thread evenAdd = new Thread(){
			public void run(){
				System.out.println(Thread.currentThread().getName()+" started!!");
				int res = 0;
				for(int i=1;i<=20;i++){
					if(i%2 == 0){
						res += i;
					}
				}	
				System.out.println(res+" "+Thread.currentThread().getName()+" ended!!");
			}
		}; // new state
		evenAdd.setName("Even-Add-Thread");
		evenAdd.start();
		
		Thread oddAdd = new Thread(){
			
			public void run(){
				System.out.println(Thread.currentThread().getName()+" started!!");
				int res = 0;
				for(int i=1;i<=20;i++){
					if(i%2 != 0){
						res += i;
					}
				}	
				System.out.println(res+" "+Thread.currentThread().getName()+" ended!!");
			}
			
		}; // new state
		oddAdd.setName("Odd-Add-Thread");
		oddAdd.start();
		
		System.out.println(Thread.currentThread().getName()+" ended!!");
	}
}

//assignimg individual task to each and every thread