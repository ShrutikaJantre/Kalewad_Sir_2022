// Q1)Count how many times the number of 1 and number of 0 will come.
import java.util.Scanner;
public class Q1{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String  b = sc.next();
		int x = 0;
		int y = 0;
	   
		for(int i=0; i < b.length(); i++){
		  char s = b.charAt(i);
		  if(s=='1') 
		  {
			  x=x+1;
		  }
		  if(s=='0') 
		  {
			  y=y+1;
		  }
		  
	  }
	System.out.println("Count of 1 in input: " +x);
	System.out.println("Count of 0 in input: " +y);
	}
}
