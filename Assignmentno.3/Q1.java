// 1)WAP to add two Matrix

import java.util.Scanner;

class Q1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Matrix 1 elements: ");
		
		int a[][] = new int[3][3];
		
		for(int i=0; i<=2; i++)
		{
			for(int j=0; j<=2; j++)
			{
				a[i][j]=sc.nextInt(); 
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		int b[][] = new int[3][3];
		
		System.out.println("Enter Matrix 2 elements: ");
		for(int i=0; i<=2; i++)
		{
			for(int j=0; j<=2; j++)
			{
				b[i][j]=sc.nextInt(); 
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		

		int c[][] = new int[3][3];
	
		System.out.println("Sum of Matrix 1 and Matrix 2: ");
		for(int i=0; i<=2; i++)
		{
			for(int j=0; j<=2; j++)
			{ 
				c[i][j] = a[i][j] + b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
			
		}
		
	}
}

