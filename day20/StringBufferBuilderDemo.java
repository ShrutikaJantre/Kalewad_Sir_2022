class StringBufferBuilderDemo{
	
	public static void main(String[] args){
		StringBuffer sb1 = new StringBuffer("ABC");
		
		String s = "abc";
		s = s.concat("def");
		System.out.println(s);
		
		sb1.append("def");
		System.out.println(sb1);
		String s2 = sb1.toString();
		System.out.println(s2);
		
	}
}