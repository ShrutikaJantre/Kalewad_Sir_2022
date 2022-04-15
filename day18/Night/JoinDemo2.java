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


class JoinDemo2{

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
			s1.join();//jiske samne join likha hai uska he harmonium sonengey
		}catch(InterruptedException e2){
			
		}
		
		s2.start();
		/* try{
			s2.join();//jiske samne join likha hai uska he harmonium sonengey
		}catch(InterruptedException e2){
			
		} */
		
		s3.start();
		try{
			s3.join();//jiske samne join likha hai uska he harmonium sonengey
		}catch(InterruptedException e2){
			
		}
		
		s4.start();
		/* try{
			s4.join();
		}catch(InterruptedException e3){
			
		} */ 

	}
}