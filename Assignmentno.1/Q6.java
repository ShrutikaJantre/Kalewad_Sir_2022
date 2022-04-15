//6. WAP to print tables of 1-30 using a while loop.

class Q6{
	public static void main(String[] args){
		int i, j;
		i = 1;
		System.out.println("Table of 1-30: ");
		while(i<=30){
			System.out.println("Table of " +i+ ":");
			j = 1;
			while(j<=10){
				System.out.println(i+ " x " +j+ " = " +i*j);
				j++;
			}
			i++;
			System.out.println();
		}
		
	}
}