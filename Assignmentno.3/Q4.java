//4)WAP to print from table 1 to 30

class Q4
{
	public static void main (String args[])
	{
		int arr[][] = new int[30][10];
		
		for (int i=0;i<arr.length;i++)
		{
			for (int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=(i+1)*(j+1);
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		}
	}
}