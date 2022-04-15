class A{
	int p = 10;
	int x = 100;
	
	void m1(){
		System.out.println("A :: m1()");
		
	}
}

class B extends A{
	int p = 20;
	int q = 30;
	
	void m2(){
		System.out.println("B :: m1()");
		
	}
}

class C extends B{
	
	int p = 40;
	int q = 50;
	int r = 60;
	
	void m3(){
		System.out.println("C :: m3()");
		
	}
}

class MultiLevelInheritanceDemo{
	public static void main(String[] args){
		A a1 = new A();
		
		a1.m1();
		
		A a2 = new B();
		A a3 = new C();
		//B b = new A();
		//C c = new A();
		//C c = new B();
		
		B b1 = new B();
		
		b1.m1();
		b1.m2();
		
		B b2 = new C();
		b2.m1();
		 
		C c = new C();
		C.m3();
		C.m2();
		c.m1();
		
		System.out.println(a1.p);
		//System.out.println(a1.q);// not valid
		//System.out.println(a1.r);// not valid
		System.out.println(a2.p);
		//System.out.println(a2.q); nv
		//System.out.println(a3.q);nv
		//System.out.println(a3.r); nv
		
		System.out.println(b1.p);
		System.out.println(b1.q);
		//System.out.println(b1.r);
		System.out.println(b1.x);
		System.out.println(b2.x);
		
		System.out.println(c.p);
		System.out.println(c.q);
		//System.out.println(b1.r);
		System.out.println(c.r);
		System.out.println(c.x);
	}


}