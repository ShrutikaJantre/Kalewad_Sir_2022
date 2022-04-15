/*
Create a class called Person with a member variable name. Save it in a file
 called Person.java Create a class called Employee who will inherit the Person 
 class.The other data members of the employee class are annual salary (double),
 the year the employee started to work, and the national insurance number which 
 is a String.Save this in a file called Employee.java Your class should have a 
 reasonable number of constructors and accessor methods.
 Write another class called TestEmployee, containing a main
 method to fully test your class definition.
 
 */


package Company;

public class Employee extends Person{
	
	private double salary;
	public int yearOfJoining;
	private String insuranceNo;
	
	public Employee(double salary,int yearOfJoining, String insuranceNo){
		//super("abc",23,"F");
		super(name,age,gender);
		this.salary=salary;
		this.yearOfJoining=yearOfJoining;
		this.insuranceNo=insuranceNo;
		
	}
	
	public double getSalary(){
		return salary;
	}
	public void setSalary(int salary){
		this.salary=salary;
	}
	
	
	public String getInsuranceNo(){
		return insuranceNo;
	}
	public void setInsuranceNo(String insuranceNo){
		this.insuranceNo=insuranceNo;
	}

}



