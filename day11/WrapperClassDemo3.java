//-128 to 127 k literals assign kartey ho
//Byte, Short, Integer, Long will always have above values in their pull
// char = 0-127
//Boolean = true, false


class WrapperClassDemo3{
	
	
	public static void main(String... args){
		Integer i1 = 100; // refers to its pull obj
		Integer i2 = 100; // refers to its pull obj
		
		System.out.println(i1 == i2);//T
		
		Byte b1 = 120;
		Byte b2 = 120;
		
		System.out.println(b1 == b2);//T
		
		Integer i3 = 1000;//heap
		Integer i4 = 1000;//heap
		System.out.println(i3 == i4);//F cz not same ref
		System.out.println(i3.equals(i4));;//T content compare karta hai
		
		Integer i5 = new Integer(100);
		System.out.println(i1 == i5);
		System.out.println(i1.equals(i5));
	}
}	