class Parent{
	void m1(int a, int b){
		System.out.println("Parent : m1");
	}
	
}

class Child extends Parent{
	@Override
	void m1(int c, int d){
		super.m1(c, d);
		System.out.println("Child : m1");
		System.out.println(a);
		System.out.println(super.a);
	}

}

class SuperDemo{
	public static void main(String args[]){
		Parent p1 = new Parent();
		Parent p2 = new Child();
		
		Child c = new Child();
		
		//p1.m1(10, 20);
		p2.m1(10, 20);
		//c.m1(10, 20);
	}
}