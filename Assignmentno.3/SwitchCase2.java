/*
 2) accept 2 numbers and a character as operator + or - or * or / or %

based on these perform the arithmetic operation.
any other character entered display "invalid choice"

 */
import java.util.*; 
public class SwitchCase2 {
	 public static void main(String[] args)
	    {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter number 1:");
			int a = sc.nextInt();
			System.out.println("Enter number 2:");
			int b = sc.nextInt();
			System.out.println("Select one arithmetic operation:");
			char ch = sc.next().charAt(0);
			
	        
	        switch(ch)
	        {
	            case '+':
	                System.out.println("Addition of " +a+ " and " +b+ " : "+(a+b));
	                break;

	            case '-':
	                System.out.println("Subtraction of "+a+" and "+b+" : "+(a-b));
	                break;

	            case '*':
	                System.out.println("Multiplication of "+a+" and "+b+" : "+(a*b));
	                break;

	            case '/':
	                System.out.println("Division of "+a+" and "+b+" : "+(a/b));
	                break;

	            case '%':
	                System.out.println("Modulo of "+a+" and "+b+" : "+(a%b));
	                break;


	            default:
	                System.out.println("Please Enter '+', '-', '*', '/' & '%' operator only.");
	        }
	    }

	    }
