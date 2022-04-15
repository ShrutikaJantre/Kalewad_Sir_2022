abstract class A{
	abstract void m1();
	abstract void m2();
	abstract void m3();
	abstract void m4();

}

abstract class B extends A{ //abstract cz m3 and m4 not implemented and not compulsion
	void m1(){
		System.out.println("m1");
	}
	void m2(){
		System.out.println("B:m2");
	}

}

abstract class C extends B{ // abtract cz compulsory hoke parent ka imp nahi likh raha
	
	void m2(){
		System.out.println("C:m2");
	}

}

class D extends C{ // no need of being abstract 
	void m3(){
		System.out.println("m3");
	}
	void m4(){
		System.out.println("m4");
	}

}

class AbstractDemo2{
	public static void main(String... args){
		
		//A a = new A();
		A a = new D();
		
		a.m1();
		a.m2();
		a.m3();
		a.m4();
		
		B b = new D();
		
		b.m1();
		b.m2();
		b.m3();
		b.m4();
		
	}	
}