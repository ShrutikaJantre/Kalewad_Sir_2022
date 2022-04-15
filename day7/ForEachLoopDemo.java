class ForEachLoopDemo{

	public static void main(String[] args){
	
		int[] arr = new int[10];
	
		for(int i =0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
		
		for(int i : arr){
			System.out.println(i);
		
		}
	
		Employee[] earr = new Employee[5];
		for(Employee e : earr){
			System.out.println(e);
		}
	}

}