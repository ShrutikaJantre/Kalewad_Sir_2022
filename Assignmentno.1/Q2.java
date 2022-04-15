//2. Assign Unicode value to char variable and print.
import java.util.*;

class Q2
{
	public static void main(String[] args)
	{
		char a = 'A';
		System.out.println(a);
		System.out.println(+a);
		System.out.println("---------------------");
		
		char b = 'a';
		System.out.println(b);
		System.out.println(+b);
		System.out.println("---------------------");
		
		char c = 92;
		System.out.println(c);
		System.out.println(+c);
		System.out.println("----------------------");
		
		char d = '\u0032';
		System.out.println(d);
		System.out.println(+d);
		System.out.println("---------------------");
		
		char c1 = 064770;
		System.out.println(c1);
		System.out.println(+c1);
		System.out.println("---------------------");
		
		char c3 = 0xcdac;
		System.out.println(c3);
		System.out.println(+c3);
		System.out.println("---------------------");
		
		char c6 = '\ucdac';
		System.out.println(c6);
		System.out.println(+c6);
	
		
	}
}	