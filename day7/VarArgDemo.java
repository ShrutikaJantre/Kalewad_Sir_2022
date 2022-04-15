class VarArgDemo{
	
	static void add(int a, int b, int... arr){
		int result = 0;
		for(int i = 0; i< arr.length; i++){
			result += arr[i];
		}
		System.out.println(result);
	}
	static void m1(int... arr){
		for(int i = 0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
		
	}
	public static void main(String[] args){
		//VarArgDemo.add();
		//VarArgDemo.add(1);
		VarArgDemo.add(1,2);
		VarArgDemo.add(1,1,1,1,1);
		
		int[] intarr = new int[5];
		m1(intarr);
		//m1(1,2,3,intarr);//not possible
	}
}