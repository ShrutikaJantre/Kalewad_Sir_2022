class ThrowDemo{

	int m1(){
		return 10;
		System.out.println("1"); //unreachable
	}
	
	public static void main(String [] args){
		System.out.println("Before");
		try{
			//throw new ArithmeticException();
			//throw new NullPointerException();
			throw new ClassCastException();
			throw new StackOverflowError(); //error: unreachable statement
		}catch(NullPointerException e){
			System.out.println("1");
		}catch(ArithmeticException e){
			System.out.println("2");
		}catch(RuntimeException e){   //P
			System.out.println("3");
		}catch(Exception e){
			System.out.println("4");
		}catch(Throwable e){
			System.out.println("5");
		}finally{
			System.out.println("Finaly!!!");
		}
		System.out.println("After");
	}
}