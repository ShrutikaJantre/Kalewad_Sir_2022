//3. WAP to access/invoke Static variable and static method.
class StaticVarMeth{
	static int a;
	static int b;
	static int sum;
	static int sub;
	
	static int sum(int a, int b){
		sum = a + b;
		return sum;
	}
	
	static int sub(int a, int b){
		sub = a - b;
		return sub;
	}
	
}
class Q3{
	public static void main(String[] args){
		System.out.println("Static Variables:");
		StaticVarMeth.a = 10;
		StaticVarMeth.b = 20;
		System.out.println("a = " +StaticVarMeth.a);
		System.out.println("b = " +StaticVarMeth.b);
		
		System.out.println("Static Methods:");
		StaticVarMeth.sum(40, 30);
		System.out.println("40 + 30 = " +StaticVarMeth.sum);
		StaticVarMeth.sub(40, 30);
		System.out.println("40 - 30 = " +StaticVarMeth.sub);
	
	}

}