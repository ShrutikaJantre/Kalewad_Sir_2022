/* 4 Write a program to accept name and age of a person from the command prompt
(passed as arguments when you execute the class) and ensure that the age entered is >=18 and < 60.
 Display proper error messages. The program must exit gracefully after displaying 
 the error message in case the arguments passed are not proper. 
(Hint : Create a user defined exception class for handling errors.) */

class AgeException extends Exception{
		AgeException(String errorMessage){
		super(errorMessage);		
	}
}

class Q4{
	
	public static void main(String args[]){
		String name = args[0];
		int age = Integer.parseInt(args[1]);
		
		try{
			if(age >= 18 && age < 60)
				System.out.println("Name: "+name+ " and Age = "+age); 
			else 
				throw new AgeException("Invalid age");
		}catch(AgeException e){
			System.out.println(e.getMessage());
		}
		
	}
}