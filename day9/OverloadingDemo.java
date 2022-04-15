class C{
	void m1(int a){
		System.out.println("C int :: m1");
	}
	
	void m1(float a){
		System.out.println("C float :: m1");
	}
	
	void m2(int a, int b, float c){
		System.out.println("C int a, int b, float c :: m2");
	}
	
	void m2(int a, double b, float c){
		System.out.println("C int a, double b, float c :: m2");
	}
}

class D extends C{
	void m2(int a, int b, float c){
		System.out.println("D int a, int b, float c :: m2");
	}
	
	void m1(double a){
		System.out.println("D Double :: m1");
	}
}

class OverloadingDemo{
	public static void main(String[] args){
		D d = new D();
		
		d.m1(10);
		d.m1(10.0f);
		
		d.m2(10, 10.0, 20.0f);
		d.m2(10, 10, 20.0f);
		
		
	}

}