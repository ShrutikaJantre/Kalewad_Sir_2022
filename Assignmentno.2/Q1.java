class MathOperations{
	
	int num1;//instance
	int num2;//instance
	
	{
		System.out.println("init block invoked!!");

	}
	
	MathOperations(int num1, int num2){
		System.out.println("Constructor invoked!!");	
		this.num1 = num1;
		this.num2 = num2;
	
	}
	
	static int result;
	
	void add(){
		result = num1 + num2;
		System.out.println(num1+ " + " +num2+ " = "+result);
		
		sub();
	}
	
	void sub(){

		result = num1 - num2;
		System.out.println(num1+ " - " +num2+ " = "+result);
		
		mul();
	}
	
	void mul(){
		
		result = num1 * num2;
		System.out.println(num1+ " x " +num2+ " = "+result);	
		div();
	}
	
	void div(){
		
		result = num1 / num2;
		System.out.println(num1+ " / " +num2+ " = "+result);
		mod();
	}
	void mod(){
		
		result = num1 % num2;
		System.out.println(num1+ " % " +num2+ " = "+result);	
		
	}
}

class Q1{

	public static void main(String args[]){
		
		MathOperations mo1 = new MathOperations(10, 20);
		mo1.add();
		
		MathOperations mo2 = new MathOperations(30, 40);
		mo2.add();
		
		MathOperations mo3 = new MathOperations(100, 20);
		mo3.add();
	}
}