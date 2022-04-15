/* 1) accept a number 1 or 2 or 3 or 4

if 1 is entered display "add"
    2			"modify"
    3			"delete"
    4			"exit"

any other number is entered display "invalid choice" */

import java.util.*;

class Choice{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number 1 or 2 or 3 or 4 : ");
		int num = sc.nextInt();
		
		switch(num){
			
			case 1:
			System.out.println("add");
			break;
			
			case 2:
			System.out.println("modify");
			break;
			
			case 3:
			System.out.println("delete");
			break;
			
			case 4:
			System.out.println("exit");
			break;
			
			default:
	        System.out.println("invalid choice");
		}
	
	}
	
}