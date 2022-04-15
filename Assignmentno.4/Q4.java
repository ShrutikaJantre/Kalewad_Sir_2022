// Q4) WAP to reverse the string. 

import java.util.Scanner;

public class Q4 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String b = sc.next();
		String s = "";
		
		for(int i = b.length()-1; i >= 0; i--){
			s = s + b.charAt(i);
		}
		System.out.println(s);
	}
}
