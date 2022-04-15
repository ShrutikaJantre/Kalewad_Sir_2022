class Employee{
	String name;
	int age;
	double salary;
	
	Employee(String name, int age, double salary){
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	void printEmployeeDetails(){
		System.out.println(name+" "+age+" "+salary);
	}
}

class {
	public static void main(String[] args){
		Employee arr[] = new Employee[5];
		arr[0] = new Employee("a", 22, 22000.0);
		arr[1] = new Employee("b", 23, 23000.0);
		arr[2] = new Employee("c", 24, 24000.0);
		arr[3] = new Employee("d", 25, 25000.0);
		arr[4] = new Employee("e", 26, 26000.0);
		
		for(int i = 0; i<arr.length; i++){
			arr[i].printEmployeeDetails();
			
		for(Employee e : arr){
			e.printEmployeeDetails();
			
		}	
		}
	}
}