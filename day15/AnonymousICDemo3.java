interface I1{

	void m1();

}
interface I2{

	void m4();

}


class AnonymousICDemo3{
	
	static void m2(I1 i){
		i.m1();
	}
	
	static void m3(I2 i){
		i.m4();
	}
	
	public static void main(String[] args){
		
		I1 a = new I1(){
			
			@Override
			public void m1(){
				System.out.println( "Child : m1()");
			
			}
			
		};
		m2(a);// a-> child clas ka on=bj
		
		m2(new I1(){
			
			@Override
			public void m1(){
				System.out.println( "Child : m1() 2nd version");
			
			}
			
		});
		 
		m3(new I2(){
			
			@Override
			public void m4(){
				System.out.println( "Child : m4() 2nd version");
			}
			
		});
	}

}