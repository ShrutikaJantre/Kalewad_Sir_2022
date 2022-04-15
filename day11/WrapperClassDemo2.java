class WrapperClassDemo2{
	
	
	public static void main(String... args){
		//boxing
		//p->WC
		Integer i1 = 10;
		System.out.println(i1);
		//step1: int -> integer
		//step2: integer = interger
		
		//unboxing
		//WC->P
		int i = i1;
		System.out.println(i);
		//step1: integer -> int
		//step2: int = int
		
		// byte b = 10;
		// Integer i2 = b; //error: incompatible types: byte cannot be converted to Integer
		//byte -> Byte
		// Integer = Byte//  nc
		
		// short s = 20;
		// Integer i3 = s; //error: incompatible types: short cannot be converted to Integer
		// short -> Short
		// Integer = Short// nc
		
		// int x = 10;
		// Byte b2 = x;
		//int -> Integer
		//Byte = Integer//nc
		
		
		
		
		
		
		
	}
}