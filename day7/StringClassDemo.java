class StringClassDemo{
	public static void main(String[] args){
		String s = "A,B,C,D,A,B,C,D";
		System.out.println(s.length());
		
		s = s.toLowerCase();
		System.out.println(s);
		
		s = s.toUpperCase();
		System.out.println(s);
		
		int index = s.indexOf("B");//2
		System.out.println(index);
		
		int lastIndex = s.lastIndexOf("B");//10
		System.out.println(lastIndex);
		
		String s2 = "   ABCD   ";
		s2 = s2.trim();
		System.out.println(s2);
		
		char c = s2.charAt(0);
		System.out.println(c);
		
		for(int i = 0; i<s2.length(); i++){
			System.out.println(s2.charAt(i));
		}
		System.out.println("split: ");
		String[] arr = s.split(",");
		for(String val: arr){
			System.out.println(val);
			
		}
		
		s = s.replace("A", "XXXXX");
		System.out.println(s);
		
		//substring
		String hw = "Hello World";
		String sHello = hw.substring(0,5);//0-4(n-10)
		String sWorld = hw.substring(6,11);
		System.out.println(sHello);
		System.out.println(sWorld);
		
	}
}