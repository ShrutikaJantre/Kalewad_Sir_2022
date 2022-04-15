class xyz
{
	static int i=200;
	static int j=100;
	int x;
	void m1()
	{
		int x=3;
		System.out.println(i);
		System.out.println(j);
		i=30;
		j=40;
		this.x=2;
		System.out.println(i);
		System.out.println(j);
		System.out.println(x);
		System.out.println(this.x);

	}
}

class Abcd1
{
	public static void main(String args[])
	{
	xyz ab=new xyz();
	ab.m1();
	ab.i=600;
	ab.j=900;
	ab.m1();
	xyz abc=new xyz();
	abc.m1();
}
}
