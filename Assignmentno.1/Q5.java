//5. WAP to print tables of 1-30 using 2 for loops and also try to print
//using single for loop.

class Q5{
	public static void main(String [] args){
	System.out.println("Tables for 1 to 30: ");
	System.out.println("====================");
	for(int i = 1; i <= 30; i++){
		
		System.out.println("Table of "+i+":");
		for(int j = 1; j <=10; j++){
			System.out.println(i+ " X " +j+ " = " +i*j);	
			}
		System.out.println();
		}
	}
}