class OuterClass{
	int x = 100;
	int a = 300;
	public void m1(){
		System.out.println("Outer : m1()");
		System.out.println("Accessing x inside OuterClass: "+x);
		//System.out.println(inner.y); //error: cannot find symbol
		//m2();//error: cannot find symbol
	}
	
	void m3(){
		
		//OuterClass.InnerClass i = this.new Inner();	
		InnerClass i = new Inner(); // instance method of class outer
		System.out.println(i.y);
		i.m1();
			
	}
	class InnerClass{
		int y = 200;
		int a = 400;
		void m2(){
			System.out.println("Inner : m2()");
			System.out.println("Accessing x inside InnerClass: "+x);;
			
			System.out.println("a Inner "+a);
			System.out.println("a Outer "+OuterClass.this.a);
			m1();
			OuterClass.this.m1();
		}
			public void m1(){
				System.out.println("Inner : m1()");

			}
		
	}
	
	class InnerClass2{
		int z = 200;
		int a = 400;
		void m2(){
			System.out.println("Inner : m2()");
			System.out.println("Accessing x inside InnerClass: "+x);;
			
			System.out.println("a Inner "+a);
			System.out.println("a Outer "+OuterClass.this.a);
			m1();
			OuterClass.this.m1();
			}
			
			
			public void m2(){
				System.out.println("Inner2 : m2()");
				System.out.println(z);
				System.out.println(a;
				System.out.println(OuterClass.this.a);
				OuterClass.this.m1();

			}
		
	}

}

class RegularInnerClassDemo1{
	public static void main(String[] args){
	
		OuterClass oc = new OuterClass();
		System.out.println(oc.x);
		oc.m1();
		
		OuterClass.InnerClass inner = oc.new InnerClass();
		System.out.println(inner.y);
		inner.m2();
		
		OuterClass.InnerClass2 inner2 = new OuterClass().new InnerClass2();
		System.out.println(inner.z);
		inner2.m3();
	}
}