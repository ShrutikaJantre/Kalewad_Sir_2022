class GrandParent{
	
	String grandFatherName;
	String grandMotherName;
	
	GrandParent(String grandFatherName, String grandMotherName){
		this.grandFatherName = grandFatherName;
		this.grandMotherName = grandMotherName;
		
		System.out.println("Grand Father Name: "+grandFatherName);
		System.out.println("Grand Mother Name: "+grandMotherName);
		
	}

}

class Parent extends GrandParent{
	
	String fatherName;
	String motherName;
	
	Parent(String fatherName, String motherName, String grandFatherName, String grandMotherName){
		this(grandFatherName, grandMotherName);
		this.fatherName = fatherName;
		this.motherName = motherName;
	
		
		System.out.println("Father Name: "+fatherName);
		System.out.println("Mother Name: "+motherName);
	}
	
	Parent(String grandFatherName, String grandMotherName){
		super(grandFatherName, grandMotherName);
		
	}
	
}

class Child{
	public static void main(String[] args){
		Parent p1 = new Parent("Himanshu", "Shrutika", "Rajesh", "Kalyani");
		
		
	}

}