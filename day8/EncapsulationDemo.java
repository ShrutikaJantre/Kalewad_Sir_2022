class Employee{
	
	private String name;
	private int age;
	private double salary;
	private String gender;
	
	Employee(String name, int age, double salary, String gender){
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.gender = gender;
	}
		public String getName(){	
			return this.name;
		}
		public void setName(String name){	
			this.name = name;
		}
		
		public int getAge(){
			return this.age;
		}
		
		public void setAge(int age){	
			this.age = age;
		}
		
		public double getSalary(){
			return this.salary;
		}
		
		public void setSalary(double salary){	
			this.salary = salary;
		}
		
		public String getGender(){	
			return this.gender;
		}
		
		public void setGender(String age){	
			this.gender = gender;
		}
}

class EncapsulationDemo{
	public static void main(String[] args){
		Employee e1 = new Employee("A", 22, 22000.2, "Male");
		//System.out.println(e1.name);//cannot access bcz of private
		System.out.println(e1.getName());
		System.out.println(e1.getAge());
		System.out.println(e1.getSalary());
		System.out.println(e1.getGender());
	
		e1.setName("B");
		e1.setAge(23);
		e1.setSalary(52000.2);
		e1.setGender("Female");	

		System.out.println(e1.getName());
		System.out.println(e1.getAge());
		System.out.println(e1.getSalary());
		System.out.println(e1.getGender());
	}


}