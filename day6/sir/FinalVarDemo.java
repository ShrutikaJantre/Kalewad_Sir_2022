class FinalVar{
	static int i;
	int a;
	int b;
	
	
	
}

class FinalVarDemo{
	
	public static void main(String... args){
		final int i=10;  // Compile time constant
		
		final int j;
		
		j = 20; 
		//j=30;//
		int a = 10;
		switch(a){
			case 1:break;
			case i:break;
			case 20:break;
			//case j:break; // this will not work. Bcoz j is not compile time constant
		}
		//i = 30; // Cant modify final var value
		
		final FinalVar fv1 = new FinalVar();
		FinalVar fv2 = new FinalVar();
		//fv1 = fv2;
		//fv1 = null;
		fv1.a = 10;
		fv1.b = 20;
	}
}

// local, static, instance