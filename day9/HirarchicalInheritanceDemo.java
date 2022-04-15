class Parent{
	int i = 10;
	void m1(){
		System.out.println("A :: m1()");
	}
}

class Child1 extends Parent{
int j = 20;
	void m2(){
		System.out.println("B :: m2()");
	}

}

class Child2 extends Parent{

int k = 30;
	void m3(){
		System.out.println("C :: m3()");
	}

}

class HirarchicalInheritanceDemo{
	public static void main(String[] args){
		Parent p1 = new Parent();
		
		Child1 c1 = new Child1();
		Child2 c2 = new Child2();
	
		Parent p2 = new Child1();
		Parent p3 = new Child2();
		
		p2.m1();
		
		//P2.m2();
		//P2.m3(); not possible
		
		c1.m1();
		c1.m2();
		
		
		c2.m3();
		c2.m1();
		//c2.m2();
		
		System.out.println(p2.i);
		//System.out.println(p2.j);
		//System.out.println(p2.k);
		
		System.out.println(c1.i);
		System.out.println(c1.j);
		//System.out.println(c1.k);
		
		System.out.println(c2.i);
		//System.out.println(c2.j);
		System.out.println(c2.k);
	}

}