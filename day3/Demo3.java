class StaticBlock
{
	static byte b;
	static short s;
	static int i;
	static long l;
	static float f;
	static double d;
	static char c;
	static boolean bool;
	
	static
	{
		System.out.println("Before b = "+b);
		b = 120;
		System.out.println("After b = "+b);
		s = 1;
		i = 2;
		l = 3;
		
		f = 0.1f;
		d = 0.2d;
		
		c = 'a';
		bool = true;
	}
	
}

class Demo3
{
	static
	{
		System.out.println("Demo:SB");
	}
	
	static
	{
		System.out.println("Demo:SB1");
	}
	
	static
	{
		System.out.println("Demo:SB2");
		System.out.println(StaticBlock.i);     
		System.out.println("Demo:SB3"); 
	}
	
	
	public static void main(String args[])
	{

	}
}