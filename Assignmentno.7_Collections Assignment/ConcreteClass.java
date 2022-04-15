interface Interface1{
	void method1();
	void method2();
}

interface Interface2{

	void method3();
}

abstract class PartialClass implements Interface1, Interface2{
	
	public void method1(){
		
		System.out.println("Override m1");
	}
	
	
	public void method3(){
	
		System.out.println("Override m3");
	}	
}

class ConcreteClass extends PartialClass{
	
	public void method2(){
		
		System.out.println("Override m2");
		
	}
	
	public static void main(String[] args){
		
		Interface1 I1 = new ConcreteClass();
		Interface2 I2 = new ConcreteClass();
		I1.method1();
		I1.method2();
		I2.method3();
	}
}

