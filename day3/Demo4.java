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

class A{
	static int p = 10;
	static{
		System.out.println("A:SB");
	}
}

class Demo4
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
	
	static
	{
		System.out.println("Demo:SB4"); 
		System.out.println(A.p);
	}
	
	
	public static void main(String args[])
	{
		System.out.println("Main method"); 
		System.out.println(A.p);
	 
		System.out.println(StaticBlock.i);
		
		StaticBlock.i = 10;
		System.out.println(StaticBlock.i);
	}
}