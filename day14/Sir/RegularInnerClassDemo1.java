class OuterClass{
	int x=100;
	int a = 300;
	public void m1(){
		System.out.println("Outer:m1()");
		System.out.println("Accessing X inside OuterClass "+x);
		//System.out.println(y);
		//m2();
	}
	
	void m3(){
		InnerClass i = new InnerClass(); 
		System.out.println(i.y);
		i.m1();
	}
	
	class InnerClass{
		int y=200;
		int a = 400;
		void m2(){
			System.out.println("Inner:m2()");
			System.out.println("Accessing X inside InneClass "+x);
			
			System.out.println("a Inner "+this.a);
			System.out.println("a Outer "+OuterClass.this.a);
			m1();
			OuterClass.this.m1();
		}
		
		public void m1(){
			System.out.println("Inner:m1()");
		}
	}
	
	class InnerClass2{
		int z=200;
		int a = 500;
		void m2(){
			
		}
		
		public void m1(){
			System.out.println("Inner2:m1()");
			System.out.println(z);
			System.out.println(a);
			System.out.println(OuterClass.this.a);
			OuterClass.this.m1();
		}
	}
	
	

}


class RegularInnerClassDemo1{
	public static void main(String[] args){
		OuterClass oc = new OuterClass();
		//System.out.println(oc.x);
		//oc.m1();
		
		OuterClass.InnerClass inner = oc.new InnerClass();
		//OuterClass.InnerClass inner = new OuterClass().new InnerClass();
		System.out.println(inner.y);
		inner.m2();
		
		
		OuterClass.InnerClass2 innerC2 = new OuterClass().new InnerClass2();
		innerC2.m1();
		
		
		oc.m3();
		
	}
}