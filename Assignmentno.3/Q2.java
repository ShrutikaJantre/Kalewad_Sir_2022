//2)WAP to multiply two Matrix

import java.util.Scanner;

class Q2
{
	public static void main(String args[])
	{
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int n = sc.nextInt();
		
		int a[][] = new int[n][n];
		int b[][] = new int[n][n];
		int c[][] = new int[n][n];
		int i, j, k;
		
		System.out.println("Enter the elements of Matrix 1: ");
		for(i=0; i<n; i++)
		{
			for(j=0; j<n; j++)
			{	
				a[i][j] = sc.nextInt();
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Enter the elements of Matrix 2: ");
		for(i=0; i<n; i++)
		{
			for(j=0; j<n; j++)
			{	
				b[i][j] = sc.nextInt();
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		
		//c[i][j] = 0;
		System.out.println("After multiplication: ");
		for(i=0; i<n; i++)
		{
			for(j=0; j<n; j++)
			{
				for(k=0; k<n; k++)
				{
					c[i][j]=c[i][j]+(a[i][k]*b[k][j]);	
				}
			}
		}
		
		for(i=0;i<n;i++)
		{
			for (j=0;j<n;j++)
			{
		        System.out.print(c[i][j]+" ");
				
		    }
			System.out.println();
		}
		
	}
}
