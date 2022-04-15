import java.util.TreeSet;
import java.util.SortedSet;
class BackedCollectionDemo{
	
	public static void main(String... args){
		
		TreeSet<Integer> set = new TreeSet<Integer>();
		
		set.add(50);
		set.add(60);
		set.add(70);
		set.add(20);
		set.add(30);
		set.add(30);
		set.add(10);
		set.add(10);
		
		System.out.println(set);
		System.out.println(set.descendingSet());
		
		SortedSet<Integer> set2 = set.headSet(30);
		System.out.println(set2);
		
		set2.add(25);
		System.out.println("Set: "+set);
		System.out.println("Backed Set2: "+set2);
		
		//set2.add(35);RTE
		set.add(35);
		System.out.println("Set: "+set);
		System.out.println("Backed Set2: "+set2);
		SortedSet<Integer> set3 = set.tailSet(30);//>=30
		SortedSet<Integer> set4 = set.subSet(30);//>=20 <=30
		
	}

}