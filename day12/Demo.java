class Demo{
	
	static void m1(){
		m2();
		
	}
	
	static void m2(){
		m1();
		
	}
	
	public static void main(String[] args){
		m1();
		System.out.println("Reached here!!");
		
	}
	

}