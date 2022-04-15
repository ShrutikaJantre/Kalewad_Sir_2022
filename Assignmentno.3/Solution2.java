class cpu
{
	int a;
	
	static{
	System.out.println("Welcome to cdac");
	}

	{
		System.out.println("hiii gopal");
		System.out.println("hiii patil");
	}
	cpu(){
		System.out.println("cpu default constructor");
	}
	cpu(int n){
		this();
		System.out.println("Cpu block parameter constructor");
		
	}
	
	void m1(int n){
		System.out.println("himanshu");
		}
	}

class dhiraj extends cpu
{
	int b=5;
	{
		System.out.println("kya karoge");
	}
	
	dhiraj(){
		super(5);
		System.out.println("zinda ho");
	}
	
	dhiraj(int n){
		this();
		System.out.println("shrutika bhaiya parameter wale");
	}
	void m1(int n1){
		super.m1(5);
		System.out.println("bediskar sir");
	}
	}

class Solution2{
	public static  void main(String args[]){
	dhiraj obj = new  dhiraj(10);
    
	cpu obj1 = new dhiraj(56);
	obj1.m1(5);
	}
}