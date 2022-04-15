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
	
}

class Demo
{
	public static void main(String args[])
	{
		System.out.println(StaticBlock.b);
		System.out.println(StaticBlock.s);
		System.out.println(StaticBlock.i);
		System.out.println(StaticBlock.l);
		System.out.println(StaticBlock.f);
		System.out.println(StaticBlock.d);
		System.out.println(StaticBlock.c);
		System.out.println((int)StaticBlock.c);
		System.out.println(StaticBlock.bool);
	}
}