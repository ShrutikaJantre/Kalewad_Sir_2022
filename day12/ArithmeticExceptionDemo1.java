
class ArithmeticExceptionDemo1{
	public static void main(String[] args){
		System.out.println("Before");
		ANE a = null;
		try{
			int i = 1/0;//NPE
			System.out.println("aaaaaa");//wont execute
		}catch(ArithmeticException e){
			e.printStackTrace();
			System.out.println("Zero se kon divide karta hai be!!!");
		}finally{
			System.out.println("Release resource");
		}
		
		System.out.println("After");
	}
}