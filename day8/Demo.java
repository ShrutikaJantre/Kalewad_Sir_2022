class Parent{
	// int a;
	// int b;
	//init
	{
		System.out.println("This is init method of parent class");
	}
	
	Parent(int a, int b)
	
	{
		
		System.out.println("This is Parent constructor");
	}
}
class Child extends Parent{
	// int a;
	// int b;
	//init
	{
		
		System.out.println("init block of Child ");
	}
	Child(int a, int b)
	{
		System.out.println("This is Child Constructor");
	}
}

class Demo{

	public static void main(String args[])
	{	
		int a;
	    int b;
		Parent p = new Parent(10,20);
		Child c = new Child(30,40);
	
	}
}
