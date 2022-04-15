/* 1.	Write a Java program to append the specified element to the end of a hash set for Employee Id and Employee name.
2.	-Write a Java program to get the number of elements in a hash set.
3.	-Write a Java program to convert a hash set to an array.
4.	-Write a Java program to convert a hash set to a tree set.
5.	-Write a Java program to convert a hash set to a List/ArrayList.
6.	-Write a Java program to remove all of the elements from a hash set. */
import java.util.*;

class Employee implements Comparable<Employee>{
	Integer employeeId;
	String name;
	
	Employee(Integer employeeId, String name){
		this.employeeId = employeeId;
		this.name = name;	
	}
	
	@Override
	public String toString(){
		return this.employeeId+", "+this.name;
	}
	
	@Override
	public boolean equals(Object o){
		if(o instanceof Employee){
			Employee temp = (Employee)o;
			if(this.employeeId.equals(temp.employeeId)&&
			this.name.equals(temp.name)){
				return true;
			}	
		}
		return false;	
	}
	
	@Override
	public int hashCode(){
		int prime = 17;
		prime = prime + prime*this.employeeId.hashCode();
		prime = prime + prime*this.name.hashCode();
		return prime;
	}
	
	@Override
	public int compareTo(Employee e){
		//return this.employeeId.compareTo(e.employeeId);
		return this.name.compareTo(e.name);
		
	}
	
	
}

class CollectionsQ3{
	public static void main(String[] args){
		
		Employee e1 = new Employee(104, "Aakash");
		Employee e2 = new Employee(101, "Sagar");	
		
		HashSet<Employee> set = new HashSet<>();
		
		System.out.println("\nWrite a Java program to append the specified element to the end of a hash set for Employee Id and Employee name.");
		set.add(e1);
		set.add(e2);
		
		System.out.println(set);
		
		System.out.println("\nWrite a Java program to get the number of elements in a hash set.");
		System.out.println(set.size());
		
		System.out.println("\nWrite a Java program to convert a hash set to an array.");
		
		/* public Object[] toArray()
           or
		public <T> T[] toArray(T[] a) */
		
		Employee arr[] = new Employee[set.size()];
		set.toArray(arr);
		for(Employee e : arr){
			System.out.println(e);
		}
		
		System.out.println("\nWrite a Java program to convert a hash set to a tree set");
		Set<Employee> treeset = new TreeSet<Employee>(set);
		for(Employee e : treeset){
			System.out.println(e);
		}
		System.out.println(treeset);
		
		System.out.println("\nWrite a Java program to convert a hash set to a List/ArrayList.");
		List<Employee> list = new ArrayList<Employee>(set);
		
		for(Employee e : list){
			System.out.println(e);
		}
		System.out.println(list);
		
		System.out.println("\nWrite a Java program to remove all of the elements from a hash set.");
		set.clear();
		
		System.out.println(set);
		
	}	
	

}	