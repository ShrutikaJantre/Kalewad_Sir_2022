class Singleton{
	private static Singleton instance = null;
	private Singleton(){
		System.out.println("invoked");
	}
	public static Singleton getInstance(){
		if(instance == null){
			instance = new Singleton();
		}
		
		return instance;
	}
	
	
}

class SingletonDemo{

	public static void main(String[] args){
		Singleton s = Singleton.getInstance();
		Singleton.getInstance();
		Singleton.getInstance();
		Singleton.getInstance();
		Singleton.getInstance();
		Singleton.getInstance();
		Singleton.getInstance();
	}
}