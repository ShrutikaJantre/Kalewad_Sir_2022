package pack2;
import pack1.Parent;

public class Child extends Parent{
	public void printParentInstanceVariables(){
		System.out.println(a);
		System.out.println(b);
		m2();
	}
	
	public static void main(String[] args){
		Parent p = new Child();
		//System.out.println(p.b); //book
		p.m1();
		
		Child c = new Child();
		System.out.println(c.b);
		c.m2();
	}
}