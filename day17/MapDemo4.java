import java.util.*;

class MapDemo4{
	public static void main(String[] args){
		//<key, value>
		HashMap<Employee, Employee> map = new HashMap<>();
		
		Employee e1 = new Employee(1, "A", "Male", 10000.0);
		Employee e2 = new Employee(2, "B", "Female", 20000.0);
		Employee e3 = new Employee(3, "C", "Male", 30000.0);
		Employee e4 = new Employee(1, "A", "Male", 10000.0);
		
		//put
		map.put(e1, e1);
		map.put(e2, e2);
		map.put(e3, e3);
		
		System.out.println(map.size());
		map.put(e4, e4);
		System.out.println(map.size());
		System.out.println(map);
		System.out.println("================================================");
		
		TreeMap<Employee, Employee> map2 = new TreeMap<>();
		
		/* Employee e1 = new Employee(1, "A", "Male", 10000.0);
		Employee e2 = new Employee(2, "B", "Female", 20000.0);
		Employee e3 = new Employee(3, "C", "Male", 30000.0);
		Employee e4 = new Employee(1, "A", "Male", 10000.0); */
	
		map2.put(e3, e3);
		map2.put(e1, e1);
		map2.put(e2, e2);
		
		System.out.println(map2.size());
		map2.put(e4, e4);
		System.out.println(map2);
	}
}