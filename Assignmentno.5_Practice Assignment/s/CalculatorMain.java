 
// A static method called powerInt(int num1,int num2) that accepts two integers 
// and returns num1 to the power of num2 (num1 power num2).
// A static method called powerDouble(double num1,int num2) that accepts one double and one integer 
// and returns num1 to the power of num2 (num1 power num2).
// Call your method from another class without instantiating 
// the class (i.e. call it like Calculator.powerInt(12,10) since your methods are defined to be static) 
// Hint: Use Math.pow(double,double) to calculate the power.


import java.util.*;

class Calculator{
	static double result;
	static double powerInt(int num1, int num2){
		System.out.println("Enter Integer number 1: " +num1);
		System.out.println("Enter Integer number 2: " +num2);

		
		return result =  Math.pow(num1, num2);
		
	}
	static double powerDouble(double num1, int num2){
		System.out.println("Enter Double number 1: " +num1);
		System.out.println("Enter Integer number 2: " +num2);
		
		return result =  Math.pow(num1, num2);
		
	}
}	

class CalculatorMain{	
	public static void main(String[] args){
		Calculator.powerInt(2, 3);
		System.out.println(Calculator.result);
		
		Calculator.powerDouble(2.0, 3);
		System.out.println(Calculator.result);
	}
}