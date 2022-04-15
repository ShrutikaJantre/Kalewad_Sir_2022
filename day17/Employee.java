class Employee implements Comparable<Employee>{
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
	
	public Integer getEmployeeId(){
		
		return this.employeeId;
	}
	public String getName(){
		
		return this.name;
	}
	public String getGender(){
		
		return this.gender;
	}
	public Double getSalary(){
		
		return this.salary;
	}
	
	public void setEmployeeId(Integer employeeId){
		this.employeeId = employeeId;	
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setGender(String gender){
		this.gender = gender;	
	}
	
	public void setSalary(Double salary){
		this.salary = salary;
	}
	
	@Override
	public String toString(){
		return this.employeeId+", "+this.name+", "+this.gender+", "+this.salary;
	}
	
	@Override
	public boolean equals(Object o){
		System.out.println("equals invoked!!!");
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
	 System.out.println("hashCode invoked!!!");
		int prime = 17;
		prime = prime + prime*this.employeeId.hashCode();
		prime = prime + prime*this.name.hashCode();
		prime = prime + prime*this.gender.hashCode();
		prime = prime + (int)(prime*salary);
		return prime;
    }
	@Override
	public int compareTo (Employee e){
		//return this.age - e.age;//0 same//- 2st bada//+ 1st bada//if int kiya hota use i.e primitive instead of wrapper
		return this.employeeId.compareTo(e.employeeId);
		
		
	}
	
}	
 