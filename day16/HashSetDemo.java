import java.util.HashSet;

class HashSetDemo{
	public static void main(String... args){
		HashSet<Integer> set = new HashSet<Integer>();
		
		set.add(10);
		//set.add(0, 10);//set never works on index
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(30);
		
		for(int i=0; i<50;i++){
			set.add(++i);
		}
		System.out.println(set.size());
		System.out.println(set);
	
		for(Integer val : set){
			System.out.print(val+" ");
		}
		
		
	}
}