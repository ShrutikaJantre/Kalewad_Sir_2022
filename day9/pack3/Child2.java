package pack3;
import pack2.Child;

class Child2 extends Child{
	public void print(){
		System.out.println(a);
		System.out.println(b);
		m2();	
	}
	
	public static void main(String[] args){
	
		Child2 c = new Child2();
		System.out.println(c.b);
		//c.printParentInstanceVariables();
	
	}
}