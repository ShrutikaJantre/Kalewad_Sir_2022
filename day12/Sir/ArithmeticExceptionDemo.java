class ArithmeticExceptionDemo{
	
	public static void main(String[] args){
		System.out.println("Before");
		try{
			int i = 1/0;
			System.out.println("aaaaaaa");
		}catch(ArithmeticException e){
			e.printStackTrace();
			System.out.println("Zero se kon divide karta he be!!!");
		}finally{
			System.out.println("Release resource");
		}
		System.out.println("After");
	}
}