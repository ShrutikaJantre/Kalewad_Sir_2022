class MyCheckedException extends Exception{
		MyCheckedException(String errorMessage){
		super(errorMessage);
		
	}
}

class MyUncheckedException extends RuntimeException{
	MyUncheckedException(String errorMessage){
		super(errorMessage);
		
	}
}

class MyUncheckedExceptionDemo1{
	
	static void m1() throws MyCheckedException{
		throw new MyCheckedException("Message!!");
	}
	static void m2() throws MyUncheckedException{
		
	}
	
	public static void main(String args[])throws MyCheckedException{
		/* try{	
			int i = 1/0;
		}catch(ArithmeticException e){
			throw new MyUncheckedException("Divide by zero is infinity. Please dont do this. As we dont want infinity. Thankyou!!");
		} */
		//m1();
		
		try{
			m1();
		}catch(MyCheckedException e){
			System.out.println(e.getMessage());
		}
		m2();//not compulsion to write throw for unchecked
	}
	
}