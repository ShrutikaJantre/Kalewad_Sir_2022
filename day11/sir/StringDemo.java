class StringDemo{

	public static void main(String... args){
		String s1 = "ABC";
		String s2 = "ABC";
		String s3 = "ABCD";
		String s4 = "ABCD";
		
		System.out.println(s1 == s2);//true
		System.out.println(s3 == s4);//true
		
		String s5 = new String("ABC");
		String s6 = new String("ABCD");
		System.out.println(s1 == s5);//false
		System.out.println(s3 == s6);//false
		// == will always compare reference content
		//and not object content
		
		System.out.println(s1.equals(s5));//true
		System.out.println(s3.equals(s6));//true
		System.out.println(s1.equals(s3));//false
		
		s1 = "ABCDE";
		String s7 = "ABC";
		String s8 = "A";
		String s9 = "BC";
		
		String s10 = s8+s9;
		
		System.out.println(s7 == s10);//false
		System.out.println(s7.equals(s10));//true
		
		
		
	}
}