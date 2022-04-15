class MethodLocalIC{
	
	void m1(){
		int x = 10;
		System.out.println(x);
		
		class MLIC{
			int y = 20;
			void m2(){
				System.out.println("MLIC:m1()");
				System.out.println(x);
				//x = 100;
			}
		}
		MLIC mlic = new MLIC();
		mlic.m2();
		System.out.println("mlic.y : "+mlic.y);
	}

}

class MethodLocalICDemo{
	public static void main(String[] args){
		MethodLocalIC mlic = new MethodLocalIC();
		mlic.m1();
	}
}