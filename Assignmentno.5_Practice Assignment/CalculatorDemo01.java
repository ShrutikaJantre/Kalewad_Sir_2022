

// 2. Create a new class called Calculator which contains the following:
// A static method called powerInt(int num1,int num2) that accepts two integers and returns num1 to the power of num2 (num1 power num2).
// A static method called powerDouble(double num1,int num2) that accepts one double and one integer and returns num1 to the power of num2 (num1 power num2).
// Call your method from another class without instantiating the class (i.e. call it like Calculator.powerInt(12,10)
//since your methods are defined to be static) Hint: Use Math.pow(double,double) to calculate the power.



class Calculator
{
	static int num1;
	static double num2;
	static int power;
	
	static int powerInt(int num1, int num2)
	{    int ans=1;
		for (int i=1; i<=num2;i++)
		{
			ans*=num1;
		}
		return ans;
	}
	
	static double powerDouble(Double num1, int num2)
	{    double ans=1.0;
		for (int i=1; i<=num2;i++)
		{
			ans*=num1;
		}
	    return ans;
	}
	
}


class CalculatorDemo01
{
	public static void main (String args[])
	{
	    System.out.println(Calculator.powerInt(5,3));
		System.out.println(Calculator.powerDouble(5.5,3));
		
	}
}