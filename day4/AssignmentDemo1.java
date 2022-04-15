class A{

	int x;
	int y;
	
	static int p;

}



class AssignmentDemo1{
	public static void main(String args[]){
	
	int x = 10;
	int y = 20;
	x = y;
	//assignment = binary transfer
	
	A a1 = new A();
	A a2 =  new A();
	A a3 =  new A();
	
	a1 = a2;
	a2 = a3;
	a3 = a1;
	
	a2.x = 100;
	a3.y = 200;
	
	System.out.println(a1.x);
	System.out.println(a1.y);
	
	//a1 = a3/a2;
	}
)