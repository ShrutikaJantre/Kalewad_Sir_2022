/* 2 Create a class called Person with a member variable name. Save it in a file called Person.java 
Create a class called Employee who will inherit the Person class.
The other data members of the employee class are annual salary (double), 
the year the employee started to work, and the national insurance number which is a String.
Save this in a file called Employee.java Your class should have a reasonable number of constructors and accessor methods. 
Write another class called TestEmployee, containing a main method to fully test your class definition. */
import java.util.Scanner;
class TestEmployee{
	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("====Enter the following Employee Details====");
		System.out.println("Name, Annaual Salary, Year of Joining and National Insurance Number.");
		String name = sc.nextLine();
		double sal = sc.nextDouble();
		int year = sc.nextInt();
		//scan.nextLine();
		String nis = sc.next();
		
		//Employee e1 = new Employee("Shrutika", 22000.2, 2022, "NIS1245");
		Employee e1 = new Employee(name, sal, year, nis);
		System.out.println("======Employee Details======");
		e1.display();
	}
}