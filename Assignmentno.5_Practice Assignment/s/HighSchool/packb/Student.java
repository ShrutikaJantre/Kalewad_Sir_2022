package packb;

public class Student extends Person{
	private int studentRollNo;
	
	public Student(String name, int age, String gender, int studentRollNo){
		super(name, age, gender);
		//this.name;
		//this.age;
		//this.gender;
		this.studentRollNo = studentRollNo;
	}
	
	public int getStudentRollNo(){
		return this.studentRollNo;
	}
	
	public void setStudentRollNo(int studentRollNo){
		this.studentRollNo = studentRollNo;
	}
	
	public void display(){
		System.out.println("Name = "+getName()+ "\nAge = "+getAge()+ "\nGender = "+getGender()+ 
		"\nStudent Roll No. = "+getStudentRollNo());
		System.out.println();
	}
	
	
}