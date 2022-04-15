/*
final class : Cant inherit
fial Method : Can not override
final abstract : cant be declared together
static methods cant override. 
*/


//final class A
class A{
	
	/*final void m1(){
		
	}*/
	public static void m3(){}
}

abstract class B extends A{
	/*final void m1(){
		
	}*/
	
	//final abstract void m2();
	//@Override
	public static void m3(){}
}


class FinalClassDemo{
	
	public static void main(String[] args){
		A.m3();
		B.m3();
	}
}

