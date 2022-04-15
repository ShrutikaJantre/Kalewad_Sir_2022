class UncheckedExceptionDemoLast{
	static void m3(){
		/* try{
			int i = 1/0;
		}catch(ArithmeticException e){
			e.printStackTrace();
			System.out.println("ArithmeticException");
		} */
		
		int i = 1/0;
		
	}
	static void m2(){
		System.out.println("Before 3");
		/* try{
			m3();
		}catch(ArithmeticException e){
			e.printStackTrace();
			System.out.println("ArithmeticException");
		} */
		
		m3();
		System.out.println("After 3");
	}
	static void m1(){
		System.out.println("Before 2");
		/* try{
			m2();
		}catch(ArithmeticException e){
			e.printStackTrace();
			System.out.println("ArithmeticException");
		} */
		m2();
		System.out.println("After 2");
	}
	static void m(){
		System.out.println("Before 1");
		try{
			m1();
		}catch(ClassCastException e){ // not matching ref var so abruptly terminates
			e.printStackTrace();
			System.out.println("ArithmeticException");
		}finally{
			System.out.println("Finaly1!!!");
		}
		//m1();
		System.out.println("After 1");
	}
	
	public static void main(String[] args){
		System.out.println("main");
		try{
			UncheckedExceptionDemoLast.m();
		}finally{
			System.out.println("Finaly!!!");
		}
		System.out.println("main after");
	}
}