class Employee{
	private Integer employeeId;
	private String name;
	private String gender;
	private Double salary;
	
	public Employee(Integer employeeId, String name, String gender, Double salary){
		this.employeeId = employeeId;
		this.name = name;
		this.gender = gender;
		this.salary = salary;
	}
	
	@Override
	public String toString(){
		return this.employeeId+", "+this.name+", "+this.gender+", "+this.salary;
	}
	
	@Override
	public boolean equals(Object o){
		if(o instanceof Employee){
			Employee temp = (Employee)o;
			if(this.employeeId.equals(temp.employeeId) &&
				this.name.equals(temp.name)&&
				this.gender.equals(temp.gender)&&
				this.salary == temp.salary)//primitive and not wrapper class
			{
					return true;
			}
		}
		return false;
		//o.name this.name
		
	}
	
	@Override
	public int hashCode(){
	 
		int prime = 17;
		prime = prime + prime*this.employeeId.hashCode();
		prime = prime + prime*this.name.hashCode();
		prime = prime + prime*this.gender.hashCode();
		prime = prime + (int)(prime*salary);
		return prime;
    }
}	
 

class Person{
	
	
}
class ObjectClassDemo{
	public static void main(String args[]){
		Employee e1 = new Employee(1, "A", "Male", 10000.0);
		Employee e2 = new Employee(2, "B", "Female", 20000.0);
		Employee e3 = new Employee(3, "C", "Male", 30000.0);
		Employee e4 = new Employee(1, "A", "Male", 10000.0);
 
		System.out.println(e1);//internally invoked as e1.toString();
		System.out.println(e2);
		System.out.println(e3);
		System.out.println(e4);
		
		System.out.println(e1 == e4); //binary representation comparison
		System.out.println(e1.equals(e4));//false// after overridding true
		
		String s1 = new String("A");
		String s2 = new String("A");
		System.out.println(s1 == s2); //binary representation comparison
		System.out.println(s1.equals(s2));
		
		
		Person p = new Person();
		System.out.println(e1.equals(p));//classCastEXCEPTION // after overring false
	
		System.out.println(s1.hashCode()); //binary representation comparison
		System.out.println(s1.hashCode());
		
		System.out.println(e1.hashCode()); //binary representation comparison
		System.out.println(e4.hashCode());
		
		
		
	}	
	
}