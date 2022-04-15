//final class A
class A{
	
	/* final void m1(){
	} */
	
	public static void m3(){
		
	}
}

abstract class B extends A{
	/* final void m1(){
	} */
	//final abstract void m2();  error: illegal combination of modifiers: abstract and final
	//@Override// ye nahi likha toh compile and run horaha tha
	
	public static void m3(){
			
	}
}

class FinalClassDemo{
	public static void main(String[] args){
		A.m3();
		B.m3();
		
	}

}