interface I3{

	void m1();

}

interface I4{

	void m4();
	void m5();

}

interface I5{

	void m6(int a, float b);

}

interface PQR{
	int add(int a, int b);
}


class LambdaExpressionDemo{
	
	
	
	public static void main(String[] args){
		I5 x = (c, d) -> {
			System.out.println( "Child : m6()");
			System.out.println( c+" "+d);
		};
		
		x.m6(10, 20.2f);
		
		I3 a = new I3(){
			
			@Override
			public void m1(){
				System.out.println( "Child : m1()");
			
			}
			
		};
		
		I3 b = () -> {
			System.out.println( "Lambda m1() called");
		};
		
		b.m1();
		
		PQR p = (aa, bb) -> aa + bb;
		System.out.println("ADD = "+p.add(10,20));
	}

}