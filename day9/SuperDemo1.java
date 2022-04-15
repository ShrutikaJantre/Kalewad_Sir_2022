class Parent{
	void m1(int a, int b){
		System.out.println("Parent : m1");
	}
	
	{
		System.out.println("init : Parent");
	}
	
	/* Parent(){
		
		System.out.println("Constructor : Parent");
	} */
	
	Parent(int a){
		//this();
		System.out.println("Constructor parameter : Parent");
	}

}

class Child extends Parent{
	{
		System.out.println("init : Child");
	}
	
	Child(){
		//super();//error: constructor Parent in class Parent cannot be applied to given types;
		super(10);//default: parent k zero ko, if parameter diya toh..
		//this(10, 20); //error: recursive constructor invocation
		System.out.println("Constructor : Child");
	}
	
	Child(int a, int b){
		this();
		System.out.println("Constructor parameter : Child");
	}
	
}

class SuperDemo1{
	public static void main(String args[]){
		//Parent p = new Parent();
		Child c = new Child(10, 20);
	}
}