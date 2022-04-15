/* 1. Create a class Box that uses a parameterized method to initialize the dimensions of a box.
(dimensions are width, height, depth of double type).
 The class should have a method that can return volume.
 Obtain an object and print the corresponding volume in main() function. */
import java.util.*;
class Box{
	static double width, height, depth;
	static double volume;
	
	void dimensions(double w, double h, double d){
		this.width = w;
		this.height = h;
		this.depth = d;
	}
	
	static double volume(){
		volume = width*height*depth;
		return volume;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter width, height and depth:");
		double w = sc.nextDouble();
		double h = sc.nextDouble();
		double d = sc.nextDouble();
		
		Box b1 = new Box();
		
		b1.dimensions(w, h, d);
		 
		System.out.println("Volume of box with dimensions width = "+w+ " height = "+h+ " width = "+d+ " is "+Box.volume());

	}
}