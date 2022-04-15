class XYZ
{
	int x=10;
	void display()
{
	int sum=x+10;
	System.out.println("value of x "+sum);
}
	void sub()
	{
		int diff=x-5;
		System.out.println("diffrence in value");
	}
}

class anonyms
{
	public static void main(String args[])
	{
		XYZ obj=new XYZ(){
		void display()
		{
			System.out.println("hiii kya hai");
		}
		void sub()
		{
			System.out.println("zinda hai bhai");
		}
	};
		obj.display();
		obj.sub();
	}
}