//Q3) WAP to find out whether the string is palindrome or not. 

import java.util.Scanner;

public class Q3{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String  b = sc.next();
		String s = "";
	   
		for(int i = b.length()-1; i >= 0; i--){
			s = s + b.charAt(i);
		}
		if(s.equalsIgnoreCase(b)){
			System.out.println("Input string is palindrome");
		}
		else
			System.out.println("Input string is not palindrome");
	}
}
