//final - finally - finalize()
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
		Runtime rt = Runtime.getRuntime();
		rt.gc();
		
		System.out.println("reched line no 26");
		for(;;){
		
		}
		
		/*
		reched line no 26
		Release the resource
		Release the resource
		Release the resource

C:\Users\shrin\OneDrive\Desktop\src\day11>java Island
reched line no 26
Release the resource
Release the resource
Release the resource

C:\Users\shrin\OneDrive\Desktop\src\day11>java Island
Release the resource
reched line no 26
Release the resource
Release the resource
		
		
		*/
		
	}
}