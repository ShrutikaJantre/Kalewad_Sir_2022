class MathOperations{
	int num1;
	int num2;
	
	MathOperations(int a, int b){
		num1 = a;
		num2 = b;
		
	}
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

class ConstructorDemo1{

	public static void main(String args[]){

		
		MathOperations mo1 = new MathOperations(10, 20);
		mo1.add();

		MathOperations mo2 = new MathOperations(40, 30);
		mo2.sub();
		
		
		
		
	}
}