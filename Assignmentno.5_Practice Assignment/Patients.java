/* 3. Design a class that can be used by a health care professional to keep track of a patient’s vital statistics.
 Here’s what the class should do:
Construct a class called Patient
Store a String name for the patient
Store weight and height for patient as doubles
Construct a new patient using these values
Write a method called BMI which returns the patient’s BMI as a double. BMI can be calculated as BMI =
( Weight in Pounds / ( Height in inches x Height in inches ) ) x 703
Next, construct a class called Patients and create a main method. Create a Patient object and assign some height and weight to that object.
 Display the BMI of that patient. */
 
 import java.util.Scanner;
 
 class Patient
 {
	 static String name;
	 static double weight;
	 static double height;
	 static double bmi;
	 
	 Patient()
	 {
	    this.name=name;
        this.weight=weight;
        this.height=height;		
	 }
	 
	 void setName(String name)
	 {
        this.name=name;
	 }
	  void setWeight(double weight)
	 {
        this.weight=weight;
	 }
	  void setHeight(double height)
	 {
        this.height=height;
	 }
	 
	 String getName()
	 {
        return name;
	 }
	  double getWeight()
	 {
        return weight;
	 }
	  double getHeight()
	 {
        return height;
	 }
	 
	 static double BMI()
	 {
		bmi = (weight/(height*height))*703;
        return bmi;		
	 }
	 
	 
 }
 
 
 class Patients
 {
	 public static void main(String args[])
	 {   
	     Scanner sc = new Scanner(System.in);
		 Patient Np1 = new Patient();
		 System.out.println("== Enter Name, Weight(in pounds) and Height(in inches) ========== ");
		 
		 Np1.setName(sc.next());
		 Np1.setWeight(sc.nextDouble());
		 Np1.setHeight(sc.nextDouble());
		 
		 System.out.println("Name : "+Np1.getName()+"  Weight : "+Np1.getWeight()+"  Height : "+Np1.getHeight());
		 System.out.println("BMI is "+Np1.BMI());
		 
		 
	 }
 }