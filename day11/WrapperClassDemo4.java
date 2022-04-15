
class WrapperClassDemo4{
	/* static void m1(int i){
		System.out.println("1"); 	 
	}
	static void m1(byte b){
		System.out.println("2"); //P
	}  */
	
	/* static void m1(int i){
		System.out.println("1"); //P 
	}
	static void m1(byte... b){
		System.out.println("2"); 
	}  */
	
	/* static void m1(int i){
		System.out.println("1"); //P 
	}
	static void m1(Byte b){ 
		System.out.println("2"); 
	}  */
	
	/* static void m1(byte... b){
		System.out.println("1"); //P 
	}
	static void m1(Byte b){ 
		System.out.println("2"); 
	}  */
	
	/* static void m1(int... x){  //reference to m1 is ambiguous CTE
		System.out.println("1"); 
	}
	static void m1(Byte... x){ 
		System.out.println("2"); 
	} 
     
	

	*/
	
	
	public static void main(String... args){
	
		byte b = 10;
		m1(b);
	}
}