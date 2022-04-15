class A{
	void m1(){
		System.out.println("A:m1()");
	}
	
	public void m2(int x, double y){
		System.out.println("A:m2()");
	}
	
	public void m3(int a, int b, float c, double d){
		System.out.println("A:m3()");
	}
	
	void m4(int a){
		System.out.println("A:m4()");
		
	}
	
	private void m5(){
		System.out.println("A:m5()");
	}

}

class B extends A{
	
	@Override //annotation//helps us to know the overrdding is happening or not
	public void m1(){
		System.out.println("B:m1()");
	}
	
	public void m2(int a, double b){
		System.out.println("B:m2()");
	}
	public void m3(int p, int q, float r, double s){
		System.out.println("B:m3()");
		
	}
	//m4 is not overrideen cz arg type is different
	void m4(double a){
		System.out.println("B:m4()");
		
	}
	
	@Override
	public void m5(){
		System.out.println("B:m5()");
	}
}

class OverridingDemo{
	public static void main(String[] args){
		A a = new B();
		
		a.m1();
		a.m2(10, 20.0);
		a.m3(10, 10, 20.0f, 20.0);
		a.m4(10);
		
		//a.m5();//wont be able to see cz of private is within the class
	}
}