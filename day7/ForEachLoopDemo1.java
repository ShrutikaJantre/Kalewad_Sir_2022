class ForEachLoopDemo1{

	public static void main(String... args){
	
		int[] arr = {10, 20, 30};
	
		for(int i =0; i < arr.length; i++){
			System.out.println(arr[i]);
		}
		
		for(int val : arr){
			System.out.println(val);
		
		}
	
		int arr2d[][] = {
						{10,20},
						{30,40},
						{50,60}
					};
		System.out.println("3D using for loop!!!") ;	
		for(int i = 0; i < arr2d.length; i++){
			for(int j = 0; j < arr2d[i].length; j++){
			System.out.print(arr2d[i][j]+ " ");
			}
		System.out.println("");
		}
		
		System.out.println("2D using for each loop!!!");
		
		for(int rows[] : arr2d){
			for(int colval : rows){
				System.out.print(colval+ " ");
			}
			System.out.println("");
		}
		
		int arr3d[][][] = {
							{
								{10,20},{30,40}
							},
							{
								{50,60},{70,80}
							}
						};
						
						
						
						
		System.out.println("3D using for loop!!!");				
		for(int i = 0; i < arr3d.length; i++){
			for(int j = 0; j < arr3d[i].length; j++){
				for(int k = 0; k < arr3d[j].length; k++){
			System.out.print(arr3d[i][j][k]+ " ");
				}
			System.out.println("");
			}
		//System.out.println("");
		}
		
		System.out.println("3D using for each loop!!!");
		for(int[][] dim1 : arr3d){
			for(int[] dim2 : dim1){
				for(int val : dim2){
					System.out.print(val+ " ");
				}
				System.out.println("");
			}
		}
	}
}