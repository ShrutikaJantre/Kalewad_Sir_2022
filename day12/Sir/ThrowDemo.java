class ThrowDemo{
	
	public static void main(String[] args){
		System.out.println("before");
		try{
			//throw new ArithmeticException();
			//throw new NullPointerException();
			//throw new ClassCastException();
			throw new StackOverflowError();
			
			//code
			
		}catch(NullPointerException e){
			System.out.println("1");
		}catch(ArithmeticException e){
			System.out.println("2");
		}catch(RuntimeException e){
			System.out.println("3");
		}catch(Exception e){
			System.out.println("4");
		}catch(Error e){
			System.out.println("5");
		}catch(Throwable e){
			System.out.println("6");
		}finally{
			System.out.println("finally!!");
		}
		System.out.println("after");
		
	}
}