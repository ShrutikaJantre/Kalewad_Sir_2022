/* Create a class called Employee who will inherit the Person class.
The other data members of the employee class are annual salary (double), 
the year the employee started to work, and the national insurance number which is a String.
Save this in a file called Employee.java Your class should have a reasonable number of constructors and accessor methods.  */

class Employee extends Person{
	double sal;
	int year;
	String NIS;
	
	Employee(String name, double annualSalary, int yearOfJoining, String nationalInsuranceNumber){
		super(name);
		this.name = name;
		this.sal = annualSalary;
		this.year = yearOfJoining;
		this.NIS = nationalInsuranceNumber;
	}
	
	void display(){
		System.out.println("Name = "+name+ "\nYear of joining = "+year+ "\nAnnual Salary = "+sal+ "\nNational Insurance Number = "+NIS);
	}	
	
}