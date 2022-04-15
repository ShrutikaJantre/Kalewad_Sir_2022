class StringDemo{

	public static void main(String args[]){
		String s1 = "ABC";
		String s2 = "ABC";
		String s3 = "ABCD";
		String s4 = "ABCD";
		
		System.out.println(s1 == s2);//true
		System.out.println(s3 == s4);//true
		
		String s5 = new String("ABC");//false
		System.out.println(s1 == s5);
		
		String s6 = new String("ABCD");//false
		System.out.println(s3 == s6); 
		
		System.out.println(s1.equals(s5));
		System.out.println(s3.equals(s6));
		System.out.println(s1.equals(s3));
		
		s1 = "ABCD";//not possible cz immutable
		String s7 = "ABC";
		String s8 = "A" + "BC";
		
		String s9 = "A";
		String s10 = s9 + s8;
		System.out.println(s2 == s8);
		System.out.println(s7 == s10);
		System.out.println(s7.equals(s10));//value comparison
		
	}
} 