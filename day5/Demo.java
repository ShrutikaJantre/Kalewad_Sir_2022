class MathOperation{
	static int intResult;
	static double doubleResult;
	
	int num1;
	int num2;
	
	MathOperation(int num1, int num2){
		this.num1 = num1;
		this.num2 = num2;
		System.out.println("init constructor invoked!!");
		
	}
		
		double d1;
		double d2;
		
	MathOperation(double d1, double d2){
		this.d1 = d1;
		this.d2 = d2;
		System.out.println("double constructor invoked!!");		
			
	}
	
	void intAdd(){
		intResult = num1 + num2;
	}
	
	void doubleAdd(){
		doubleResult = d1 + d2;
	}
	
	
		

}


class Demo{
	public static void main(String [] args){
		MathOperation mo1 = new MathOperation(10, 20);
		mo1.intAdd();
		MathOperation mo2 = new MathOperation(10.0, 20.0);
		mo1.doubleAdd();
		
		System.out.println("intResult = "+MathOperation.intResult);
		System.out.println("intResult = "+MathOperation.doubleResult);
	}

}