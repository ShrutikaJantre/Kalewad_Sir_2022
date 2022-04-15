import java.util.*;

class MapDemo2{
	public static void main(String[] args){
		//<key, value>
		LinkedHashMap<Integer, Employee> map = new LinkedHashMap<>();
		
		Employee e1 = new Employee(1, "A", "Male", 10000.0);
		Employee e2 = new Employee(2, "B", "Female", 20000.0);
		Employee e3 = new Employee(3, "C", "Male", 30000.0);

		//put
		map.put(1, e1);
		map.put(2, e2);
		map.put(3, e3);
		System.out.println("Before: "+map.get(1));
		Employee e = map.get(1);//map.get(key)
		e.setSalary(30000.0);
		System.out.println("After: "+map.get(1));
		
		map.remove(2);
		System.out.println("Before: "+map.size());//2
		
		//map.containsKey(3);
		System.out.println(map.containsKey(3));//t
		Employee e4 = new Employee(1, "A", "Male", 10000.0);
		//map.containsValue(e4);
		
		System.out.println(map.containsKey(e4));//t
		System.out.println(map.containsKey(2));//f
		//TreeMap<Employee, Employee> map = new TreeMap<>();
		
		System.out.println(map);
		map.put(3, null);
		System.out.println(map);//f
		System.out.println(+map.size());
	}
}