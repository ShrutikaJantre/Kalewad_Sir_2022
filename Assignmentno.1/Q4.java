// 4. WAP to declare static variables of all primitive data types and print
// their default value.

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

class Q4
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