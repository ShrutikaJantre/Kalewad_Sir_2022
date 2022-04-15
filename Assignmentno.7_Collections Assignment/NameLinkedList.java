import java.util.LinkedList;
import java.util.Collections;
import java.util.Iterator;	//to iterator the elements
import java.util.ListIterator;  //To reverse the list
import java.util.ArrayList;


class NameLinkedList{

	public static void main(String args[]){
	
	LinkedList<String> names = new LinkedList<String>();
	
	names.add("Shrushti");
	names.add("Pradnya");
	names.add("Ashu");
	names.add("Yogita");
	
	System.out.println("1.Display :"+names);
	
	//1.Appending elements at the last of LinkedList
	
	names.addLast("Arpita");
	System.out.println("\n2. Appending element at the last of the list :"+names);
	
	//1st way ---->Iterating through the list
	System.out.println("Linked list Iterating :");
	for(int i=0;i < names.size();i++){
		System.out.println(names.get(i));
	}
	
	
	
	//2nd way ------> set Iterator at given index
	Iterator i = names.listIterator(3);
	
	//print list from second position 
	System.out.println("\n3. Iterating names : ");
	while(i.hasNext()){
		System.out.println(i.next());
	}
	
	//iterate linked list in reverse order
	/*
	while(i.hasPrevious())
	{
		System.out.println(names.previous());
	}
	
	
	Collections.reverse(names);
	System.out.println("Reversein tht eliked list "+ names);
	
	*/
	
	//add elements at the first and the last position
	names.addFirst("Ashish");
	System.out.println(names);
	names.addLast("Tanmayi");
	System.out.println(names);
	names.addLast("Desai");
	
	
	//add Element at first position
	names.addFirst("Desai");
	System.out.println("Element addded at first position : "+names);
	
	//Adding elemet at specified postion of the list
	names.add(3,"Khushbu");
	names.add(2,"Ashish");
	System.out.println("Element addded at Specified position : "+names);
	
	//get first element and last element of the list
	
	Object lastElement = names.getLast();
	System.out.println("Last element : "+lastElement );
	Object firstElement = names.getFirst();
	System.out.println("First element : "+firstElement );
	

	//remove the first and last occurances of element in the list 
	Object removelastElement = names.removeLast();
	System.out.println(" removed Last element : "+removelastElement );
	Object removefirstElement = names.removeFirst();
	System.out.println("removed Last element : "+removefirstElement );
	System.out.println(names);
	
	//swap two elements

		Collections.swap(names,0,4);
		System.out.println(names);
		
		LinkedList <String> surname= new LinkedList<String>();
		surname.add("Natekar");
		surname.add("Sawant");
		
		LinkedList <String> fullName = new LinkedList<String>();
		fullName.addAll(names);
		fullName.addAll(surname);
		
		System.out.println(fullName);
		
		//check if element contains in the collection
		
		System.out.println("Does the list contains Desai :"+fullName.contains("Desai"));
		
		System.out.println("Does the list contains Shrushti :"+fullName.contains("Shrushti"));
		//System.out.println(fullName);
	
	
	//converting linked list into arraylist
		ArrayList <String> newArraylist = new ArrayList<String>(fullName);
		System.out.println("\nNew ArayList :");
		for(String str :newArraylist)
		
		System.out.println(str);
		
		//check if list is empty or not
		System.out.println("Is list empty? "+fullName.isEmpty());
		
		//replace element
		fullName.set(3,"Vanita");
		System.out.println(fullName);
	
	
	//Compare two linked list
	//
	
	if(names.equals(fullName)==true)
		System.out.println("List are equal ");
	else
		System.out.println("List are not equal ");
	}

}