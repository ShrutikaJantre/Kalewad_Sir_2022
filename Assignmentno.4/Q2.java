//Q2)How many times 0 will come after 1

import java.util.Scanner;

public class Q2{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String b = sc.next();
		int count = 0;
		char m = '1';
		int n = '0';
		 for(int  i= 0; i < b.length(); i++){
			char s = b.charAt(i); 
			
			if(i < b.length()-1){ 
			
				if(s == m){   
				char k = b.charAt(i + 1);
				
					if(k == n){
						count = count + 1;
			        }
			    }
			}
		  
		}
		System.out.println("0 comes " +count+ " times after 1");
	}

}
