
interface I1{
	void m1();
}
	
interface I2{
	void m1(int c,int d);
}


class Day15{
	public static void main(String ... args){
		I1 i1 = () -> {
				System.out.println("Welcome To Lambda Expression");
			};
			
			i1.m1();	
			
			I2 i2 = (a,b) -> {
				a=14;
				b=15;
				System.out.println("a :"+a);
				System.out.println("b :"+b);
			};
			i2.m1(4,5);
		}
}

//you made lambda expression class which was not needed 