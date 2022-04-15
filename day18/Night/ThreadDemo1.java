//Mutiple threads common task

class Gopal extends Thread{
	@Override
	public void run(){
		for(int i=1; i<=10; i++){
			System.out.println(i+ " of " +Thread.currentThread().getName());
			
		}
		
	}

}

class ThreadDemo1{
	public static void main(String[] args){
		
		System.out.println(Thread.currentThread().getName()+" Started");
		Gopal g1 = new Gopal();//new
		g1.setName("Gopal1");
		g1.start();
		
		Gopal g2 = new Gopal();
		g2.setName("Gopal2");
		g2.start();
		
		Gopal g3 = new Gopal();
		g3.setName("Gopal3");
		g3.start();
		
		Gopal g4 = new Gopal();
		g4.setName("Gopal4");
		g4.start();
		
		System.out.println(Thread.currentThread().getName()+" Ended");
	}
}