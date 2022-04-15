// 3 Write a class MathOperation which accepts integers from command line. Create an array using these parameters. 
// Loop through the array and obtain the sum and average of all the elements. Display the result. 
// Check for various exceptions that may arise like ArithmeticException, NumberFormatException, and so on. 
// For example: The class would be invoked as follows: C:>java MathOperation 1900, 4560, 0, 32500

import java.util.*;

class MathOperation{
	public static void main(String[] args){

		int n = args.length;
		int arr[] = new int[n];
		int i, sum=0, avg=0;
		try{
			for(i=0; i<n; i++){
				arr[i] = Integer.parseInt(args[i]);
				sum = sum + arr[i];
			}
			avg = sum/n;
			System.out.println("Sum = "+sum);
			System.out.println("Average = "+avg);
		}catch(ArithmeticException e){
			System.out.println("ArithmeticException");
		}catch(NumberFormatException e1){
			System.out.println("NumberFormatException");
		}catch(ArrayIndexOutOfBoundsException e2){
			System.out.println("ArrayIndexOutOfBoundsException");
		}finally{
			System.out.println("Done.");
		}
	}
}