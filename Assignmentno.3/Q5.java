//5)WAP to print transpose of a matrix

import java.util.Scanner;

class Q5
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a[][] = new int[3][3];
		int b[][] = new int[3][3];
		int i, j, k;
		
		System.out.println("Enter the matrix 1 elements:");
		for(i=0; i<=2; i++)
		{
			for(j=0; j<=2; j++)
			{
				a[i][j] = sc.nextInt();
				
			}
		}
		
		System.out.println("Matrix 1:");
		for(int [] x:a)
		{
			for(int y:x)
			{
				System.out.print(y+ "  ");
			}
			System.out.println();
		}
		
		for(i=0; i<=2; i++)
		{
			for(j=0; j<=2; j++)
			{
				b[i][j] = a[j][i];
			}
		}
		
		System.out.println("Transpose Matrix:");
		for(int [] x:b)
		{
			for(int y:x)
			{
				System.out.print(y+ "  ");
			}
			System.out.println();
		}
		
	}	
}