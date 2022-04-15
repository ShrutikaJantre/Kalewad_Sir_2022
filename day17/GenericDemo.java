import java.util.*;

class PP{
	
	
}

class CC extends PP{
	
	
}

class GenericDemo{
	public static void main(String args[]){
		
		
		PP[] arr2 = new PP[10];
		CC[] arr3 = new CC[10];
		
		arr2 = arr3;
		System.out.println("*******************");
		
		ArrayList<PP> list1 = new ArrayList<>();
		ArrayList<CC> list2 = new ArrayList<>();
		ArrayList<CC> list3 = new ArrayList<>();
		//list1 = list2;//not possible
		
		list2 = list3;//child to chill possible
		
		ArrayList<? extends PP> list4 = list2;//Read-only collection
		ArrayList<? extends CC> list5 = list3;//Assign CC ka arraylist or CC ka child to arraylist
											  //but list4 and list 5 is read only collection
	
		//list4.add(new PP());
	
		//list5.add(new PP());
		
		ArrayList<? super CC> list6 = list1;
		ArrayList<? super CC> list7 = list2;
		
		ArrayList<Object> list8 = mew ArrayList<>();
		ArrayList<? super CC> list9 = list8;
		list6.add(new CC());
		list7.add(new CC());
		list9.add(new CC());
		//list9.add(new PP())
		
		ArrayList<? super CC> list10 = list1;
		list10.add(new PP());
		list10.add(new CC());
		//list10.add(new Object());
		
		ArrayList<? super CC> list11 = new ArrayList<Object>();
		//list11.add();
		
		ArrayList<? extends Object> list12 = list1;
		//list12.add(new PP());
		
		ArrayList<?> list13 = list1;//read only. Assign any collection to list13
		
		
	}

}

//you cannot assign child collection to parent collection

//? extends CLASSNAME

//? super CLASSNAME


//how we can assign one type of array list to another
