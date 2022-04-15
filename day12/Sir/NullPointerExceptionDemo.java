class ANE{
	
	void m1(){
		System.out.println("m1 invoked!!");
	}
	
}

class NullPointerExceptionDemo{
	
	public static void main(String[] args){
		System.out.println("Before");
		ANE a = null;
		try{
			a.m1();//NPE
		}catch(NullPointerException e){
			e.printStackTrace();
			System.out.println("Null se invoke karna band kar!!!");
		}finally{
			System.out.println("finally");
		}
		System.out.println("After");
	}
}