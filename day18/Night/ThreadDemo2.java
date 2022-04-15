//Mutiple threads -> different task

class Gopal extends Thread{
	@Override
	public void run(){
		for(int i=1; i<=10; i++){
			System.out.println(" Gopal thread " +Thread.currentThread().getName());
			
		}
		
	}

}

class Himanshu extends Thread{
	@Override
	public void run(){
		for(int i=1; i<=10; i++){
			System.out.println(" Himanshu thread " +Thread.currentThread().getName());
			
		}
		
	}

}

class Snehal extends Thread{
	@Override
	public void run(){
		for(int i=1; i<=10; i++){
			System.out.println(" Snehal thread " +Thread.currentThread().getName());
			
		}
		
	}

}

class ThreadDemo2{
	public static void main(String[] args){
		
		System.out.println(Thread.currentThread().getName()+" Started");
		Gopal g1 = new Gopal();//new
		g1.setName("Gopal");
		g1.start();
		
		Himanshu h2 = new Himanshu();
		h2.setName("Himanshu");
		h2.start();
		
		Snehal h3 = new Snehal();
		h3.setName("Snehal");
		h3.start();
		
		System.out.println(Thread.currentThread().getName()+" Ended");
	}
}