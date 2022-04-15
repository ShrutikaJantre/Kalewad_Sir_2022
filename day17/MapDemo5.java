import java.util.*;

class MapDemo5{
	public static void main(String[] args){
		//<key, value>
		TreeMap<Integer, Employee> map = new TreeMap<>();
		
		Employee e1 = new Employee(1, "A", "Male", 10000.0);
		Employee e2 = new Employee(2, "B", "Female", 20000.0);
		Employee e3 = new Employee(3, "C", "Male", 30000.0);

		//put
		map.put(1, e1);
		map.put(2, e2);
		map.put(3, e3);
		
		System.out.println(map);//3
		SortedMap<Integer, Employee> map2 = map.headMap(2);
		System.out.println(map2);
		
		SortedMap<Integer, Employee> map3 = map.tailMap(2);
		System.out.println(map3);
		
		SortedMap<Integer, Employee> map4 = map.tailMap(2, 30);
		System.out.println(map4);
	}
}