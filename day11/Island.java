class Island{
	Island i;
	
	@Override
	protected void finalize(){
		System.out.println("Release the resource");
	}
	public static void main(String[] args){
		Island i1 = new Island();
		Island i2 = new Island();
		Island i3 = new Island();
		
		i1.i = i3;
		i3.i = i2;
		i2.i = i1;
		
		i1 = null;
		i2 = null;
		i3 = null;
		
		System.gc();
		Runtime rt =  Runtime.getRuntime(); 
		rt.gc();
		
		System.out.println("Reached line no.25");
		for(;;){
		
		}
		
	}

}