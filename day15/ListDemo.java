import java.util.Arraylist;
class ListDemo{
	public static void main(String[] args){
		ArrayList<Employee> list = new ArrayList<Employee>();
		
		Employee e1 = new Employee(1, "A", "Male", 10000.0);
		Employee e2 = new Employee(2, "B", "Female", 20000.0);
		Employee e3 = new Employee(3, "C", "Male", 30000.0);
		Employee e4 = new Employee(1, "A", "Male", 10000.0);

		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		
		System.out.println(list);
	}
}
