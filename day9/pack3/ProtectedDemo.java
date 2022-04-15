package pack3;
import pack2.Child;

class ProtectedDemo{
	public static void main(String[] args){
	
		Child c = new Child();
		//System.out.println(c.b);
		c.printParentInstanceVariables();
	
	}

}