import java.io.*;
/* class NaamMeKyaRakhahe{
	int i = 10;
} */

class ExceptionDemo6{
	
	static void m1() throws FileNotFoundException{
		
	}
	static int m2(){
		try{
			int i = 1/0;
			
			//NaamMeKyaRakhahe n = null;
			//n.i = 100;
			return 10; //if no exception
		}catch(ArithmeticException e){
			return 20;// if there's exception
		}finally{
			return 30;//always execute
		}
		//return 40;//zero chances
	}
	
	static int m3(){
		int[] arr = new int[5];
		arr[10] = 30/0;
		try{
			return 10;
		}catch(ArithmeticException e){
			return 20;
		}finally{
			return 30;//always execute
		}
	}
	
	public static void main(String[] args){
		try{
			//int i = 1/0;
		}catch(ArithmeticException e){
			
		//}catch(FileNotFoundException e1){
			
		}
		System.out.println(m2());
	
		try{
			File f = new File("abcd,txt");
			FileReader fr = new FileReader(f);
		}catch( FileNotFoundException | ArrayIndexOutOfBoundsException | StringIndexOutOfBoundsException | 
			NullPointerException | ClassCastException e){
			
		}
	
		m3();	
	
	}
}

//error: exception FileNotFoundException is never 
//thrown in body of corresponding try statement