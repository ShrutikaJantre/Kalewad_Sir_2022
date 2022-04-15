class Person{
	private String name;
	private int age;
	
	/*
	public Person(String name, int age){
		
		this.name=name;
		this.age=age;
	}
	*/
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age= age;
	}
	
}


class Student extends Person{
	int Rollno;
	
	public int getRollno(){
		return Rollno;
	}
	public void setRollno(int Rollno){
		this.Rollno= Rollno;
	}
	
}


class CollegeStudent extends Student{
	int year;
	String major;
	public int getYear(){
		return year;
	}
	public void setYear(int year){
		this.year= year;
	}
	public String getMajor(){
		return major;
	}
	public void setMajor(String major){
		this.major= major;
	}
		
}

class Teacher extends Person{
	int salary;
	String subject;
	
	public int getSalary(){
		return salary;
	}
	public void setSalary(int salary){
		this.salary= salary;
	}
	public String getSubject(){
		return subject;
	}
	public void setSubject(String subject){
		this.subject= subject;
	}
	
} 


class HighSchoolApplication{
	public static void main(String args[])
	{
		
		Person p1 = new Person();
		p1.setName("Swami");
		p1.setAge(25);
		System.out.println(p1.getName() + " " + p1.getAge());
		
		Student s1 = new Student();
		s1.setName("Shubham");
		s1.setAge(23);
		s1.setRollno(87);
		
		Student s2 = new Student();
		s2.setName("Bali");
		s2.setAge(23);
		s2.setRollno(77);
		
		CollegeStudent cg1 = new CollegeStudent();
		cg1.setName("Shrushti");
		cg1.setAge(23);
		cg1.setRollno(92);
		cg1.setYear(2022);
		cg1.setMajor("IT");
		
		Teacher t1 = new Teacher();
		t1.setName("Shrushti");
		t1.setAge(23);
		t1.setSalary(50000);
		t1.setSubject("OOPs");
		
		
		

		
		
		System.out.println(s1.getName() + " " + s1.getAge() +" " + s1.getRollno());
		System.out.println(s2.getName() + " " + s2.getAge() +" " + s2.getRollno());
		System.out.println(cg1.getName() + " " + cg1.getAge() +" " + cg1.getRollno() + " " + cg1.getYear() + " " + cg1.getMajor());
		System.out.println(t1.getName() + " " + t1.getAge() +" " + t1.getSalary() + " "+ t1.getSubject());
		
	}
}



