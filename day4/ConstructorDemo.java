class MathOperations{
	int num1;
	int num2;
	
	static int result;
	
	void add(){
		result = num1 + num2;
		System.out.println("Result : "+result);
		
	}
	
	void sub(){
		System.out.println("Result : "+result);
		result = num1 - num2;
		System.out.println("Result : "+result);
		
	}
}

class ConstructorDemo{

	public static void main(String args[]){

		
		MathOperations mo = new MathOperations();
		mo.num1 = 10;
		mo.num2 = 20;
		
		mo.add();
		mo.sub();
		
		
	}
}