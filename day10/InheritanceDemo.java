interface I1{
	void m1();

}

interface I2 extends I1{
	void m2();

}

interface I3 extends I1{
	void m3();

}

interface I4{
	int m4();
}

interface I5{
	void m4();
}

abstract class AC1 implements I2{

}

abstract class AC2 implements I3, I4{


}


class CC3 implements I4, I5{
	/* public void m4(){
		
		
	}
	public int m4(){
		
		
	} */ //neither overriding or overloading.. compile time eeror
}

class CC1 extends AC1{
	public void m1(){
		System.out.println("CC1:m1()");
	}
	
	public void m2(){
		System.out.println("CC1:m1()");
	}
}

class CC2 extends AC2 implements I4{
	public void m1(){
		System.out.println("CC2:m1()");
	}
	
	public void m3(){
		System.out.println("CC2:m3()");
	}
	
	public void m4(){
		System.out.println("CC2:m4()");
	}
}


class InheritanceDemo{
	public static void main(String... args){
		I1 i1 = new CC1();
		I1 i2 = new CC2();
		
		i1.m1();
		//i1.m2();
	}
	
}