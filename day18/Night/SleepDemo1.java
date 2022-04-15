class Sleep extends Thread{
	
	@Override
	public void run(){
		System.out.println(Thread.currentThread().getName()+" Started");
		for(int i=1; i<=5; i++){
			
			System.out.println(" Raju Bhai Harmonium wale!!! " +Thread.currentThread().getName());
				
		}
		System.out.println(Thread.currentThread().getName()+" Ended");	
	}
	
}


class SleepDemo1{

	public static void main(String[] args){
		
		Sleep s1 = new Sleep();
		s1.setName("Sleep 1");
		
		Sleep s2 = new Sleep();
		s2.setName("Sleep 2");
		
		Sleep s3 = new Sleep();
		s3.setName("Sleep 3");
		
		Sleep s4 = new Sleep();
		s4.setName("Sleep 4");
		
		s1.start();
		try{
			s1.join();
		}catch(InterruptedException e2){
			
		}
		
		s2.start();
		/* try{
			s2.join();
		}catch(InterruptedException e2){
			
		}
		try{
			
			s2.sleep(6000);
		}catch(InterruptedException e2){
			
		}
		 */
		s3.start();
		
		/* try{
			s3.sleep(3000);
		}catch(InterruptedException e2){
			
		} */
		
		s4.start();
		
		/* try{
			s4.sleep(1000);
		}catch(InterruptedException e3){
			
		}  */

	}
}

//child ko main call kar raha hai so jo sleep method ko call kar raha hai vo sota hai