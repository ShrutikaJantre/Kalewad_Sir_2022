class A{}
class B extends A{}

class ClassCastExceptionDemo{
	
	public static void main(String[] args){
		System.out.println("Before");
		A a = new A();
		try{
			B b = (B)a;
		}catch(ClassCastException e){
			System.out.println(e.getMessage());
			e.printStackTrace();
			//exception handling code
			System.out.println("Invalid Downcasting!!");
			System.out.println("Ref var can hold object of same class or child class");
		}
		System.out.println("After");
	}
}

//try-catch()-finally 