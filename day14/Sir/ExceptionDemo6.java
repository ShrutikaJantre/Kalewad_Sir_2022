import java.io.*;
class NaamMeKyaRakhaHe{
	int i = 10;
}
class ExceptionDemo6{
	static void m1()throws FileNotFoundException{
		
	}
	
	static int m2(){
		
		try{
			System.exit(0);
		}catch(ArithmeticException e){
			return 20;
		}finally{
			System.out.println("Finally");
			return 30;
		}
		

		//return 40;
		
	}
	
	public static void main(String[] args){
		/*try{
			//Class.forName("ABCD.class");
		}catch(ArithmeticException e){
			
		}catch(ClassNotFoundException e){
			
		}*/
		
		System.out.println(m2());
		
		/*try{
			File f = new File("abcd.txt");
			FileReader fr = new FileReader(f);//throw new FileNotFoundException();
		}catch(FileNotFoundException | NullPointerException
				| IndexOutOfBoundsException | ClassCastException e){
			
		}*/
		
	}
}