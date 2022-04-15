/* Q5) WAP to print words in reverse.
 i/p: ab cd ef gh ij kl */


import java.util.Scanner;

public class Q5 {
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	String  b = sc.nextLine();
	String s[] = b.split(" ");
	
		for(int i = s.length-1; i>=0; i--){
			System.out.print(s[i]+" ");
		}
	}

}
