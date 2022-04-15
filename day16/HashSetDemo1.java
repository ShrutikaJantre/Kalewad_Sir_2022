import java.util.HashSet;
import java.util.LinkedHashSet;

class HashSetDemo1{
	public static void main(String args[]){
	
		HashSet<Integer> set = new HashSet<Integer>();
		
		set.add(10);
		//set.add(0, 10);//not allowed cz here there is no index position
		set.add(10);
		set.add(20);
		set.add(30);
		
		/* for(int i=0; i<100; i++){
			set.add(i);
		} */
		System.out.println(set.size());
		System.out.println(set);
		
		for(Integer val : set){
			System.out.print(val + " ");
		}
		
		set.remove(10);
		System.out.println(set);
		
		System.out.println(set.contains(10));//F
		System.out.println(set.contains(20));//T
		
		LinkedHashSet<Integer> set2 = new LinkedHashSet<Integer>();
		
		set2.add(10);
		set2.add(20);
		set2.add(10);
		System.out.println(set2.size());
		System.out.println(set2);//10, 20
		
		set2.add(null);
		System.out.println(set2.size());
		System.out.println(set2);//10, 20
	}	

}