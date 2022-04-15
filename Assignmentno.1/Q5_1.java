/* declare j as 1 which will go till 30
for loop i 1->10
Print logic of tables
After every 10th interation increase the value of j
and reset the value of i to 1 and do this till j is 30
end for loop
 */

class Q5_1{


	public static void main(String [] args){

		int j=1;
		for(int i=1; i<=10; i++){
		System.out.println(j+ " X " +i+ " = " +j*i);
			if(i>=10){
				j++;
				i=0;
				
				System.out.println();
				if(j>30)
				break;
			}
		}
	}
}