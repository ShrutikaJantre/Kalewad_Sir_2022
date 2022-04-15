// 1.Write a Java program to append the specified element to the end of a linked list of names.
// -Write a Java program to iterate through all elements in a linked list starting at the specified position.
// -Write a Java program to iterate a linked list in reverse order.
// -Write a Java program to insert the specified element at the specified position in the linked list.
// -Write a Java program to insert elements into the linked list at the first and last position.
// -Write a Java program to insert the specified element at the front of a linked list.
// -Write a Java program to insert some elements at the specified position into a linked list.
// -Write a Java program to get the first and last occurrence of the specified elements in a linked lÎSt.
// -Write a Java program to remove first and last element from a linked list.
// -Write a Java program of swap two elements in a linked list.
// -Write a Java program to join two linked lists.
// -Write a Java program to check if a particular element exists in a linked list.
// -Write a Java program to convert a linked list to array list.
// -Write a Java program to compare two linked lists.
// -Write a Java program to test an linked list is empty or not.
// -Write a Java program to replace an element in a linked list.

import java.util.*;

class CollectionsQ2{
	
	public static void main(String[] args){
	
		LinkedList<String> list = new LinkedList<>();
		
		list.add("Bediskar");
		list.add("Rajesh");
		list.add("Gopal");
		list.add("Himanshu");
		list.add("Kalyani");
		list.add("Nayan");
		list.add("Rohit");
		list.add("Tejas");
		list.add("Snehal");
		list.add("Siddhi");
		
		System.out.println("\nWrite a Java program to append the specified element to the end of a linked list of names.");
		list.addLast("Shrutika");
		System.out.println(list.size());
		System.out.println(list);
		
		System.out.println("\nWrite a Java program to iterate through all elements in a linked list starting at the specified position.");
		Iterator list1 = list.listIterator(0);
		while(list1.hasNext()){
			System.out.println(list1.next());
		}
		
		System.out.println("\nWrite a Java program to iterate a linked list in reverse order.");
		Iterator list2 = list.descendingIterator();
		System.out.println("\nReverse order:");
		while(list2.hasNext()){
			System.out.println(list2.next());
		}
		
		System.out.println("\nWrite a Java program to insert the specified element at the specified position in the linked list.");
		list.add(2, "Kalewad Sir");
		System.out.println(list);
		
		System.out.println("\nWrite a Java program to insert elements into the linked list at the first and last position.");
		list.addFirst("CDAC");
		list.addLast("Bye!!!");
		System.out.println(list);
		
		System.out.println("\nWrite a Java program to insert the specified element at the front of a linked list.");
		list.offerFirst("Hi!!!");
		System.out.println(list);
		
		System.out.println("\nWrite a Java program to insert some elements at the specified position into a linked list.");
		LinkedList<String> list3 = new LinkedList<>();//making list again we want to add not single but multiple elements
		list3.add("Mumbai");
		list3.add("Juhu");
		
		list.addAll(2, list3);//addAll to add everything in the list
		System.out.println(list);
		
		System.out.println("\nWrite a Java program to get the first and last occurrence of the specified elements in a linked list.");
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		
		System.out.println("\nWrite a Java program to remove first and last element from a linked list.");
		list.removeFirst();
		list.removeLast();
		System.out.println(list);
		
		System.out.println("\nWrite a Java program of swap two elements in a linked list.");
		Collections.swap(list, 0, 1);
		System.out.println(list);
		
		System.out.println("\nWrite a Java program to join two linked lists.");
		LinkedList<String> list4 = new LinkedList<>();
		list4.add("Bye!!!");
		list4.add("See you soon!!!");
		
		LinkedList<String> listjoin = new LinkedList<>();
		listjoin.addAll(list);
		listjoin.addAll(list4);
		System.out.println(listjoin);
		
		System.out.println("\nWrite a Java program to check if a particular element exists in a linked list.");
		System.out.println(list.contains("Shrutika"));//true
		System.out.println(list.contains("Hi!!!"));//false
		
		System.out.println("\nWrite a Java program to convert a linked list to array list.");
		
		List<String> newlist = new ArrayList<String>(list);
		
		for(String str : newlist){
			System.out.println(str);
		}

		System.out.println("\nWrite a Java program to compare two linked lists.");
		LinkedList<String> listcomp = new LinkedList<>();
		for (String comp : listjoin){
             listcomp.add(list.contains(comp) ? "Yes" : "No");
		}
          System.out.println(listcomp); 
		  
		System.out.println("\nWrite a Java program to test an linked list is empty or not.");
		System.out.println(list.isEmpty());//false
		list4.removeAll(list4);
		System.out.println(list4.isEmpty());//true
		
		System.out.println("\nWrite a Java program to replace an element in a linked list.");
		
		list.set(1, "Replace");
		System.out.println(list);
		
	}
}
		
/* // set Iterator at specified index
 Using Iterator

To iterate the LinkedList using the iterator we first create an iterator to the current list and keep on printing 
the next element using the next() method until the next element exists inside the LinkedList.
We check if the LinkedList contains the next element using the hasNext() method.
		   Iterator p = l_list.listIterator(1);

		   // print list from second position
		   while (p.hasNext()) {
		   System.out.println(p.next());
			} */
			
	/* Iterator it = l_list.descendingIterator();

     // Print list elements in reverse order
     System.out.println("Elements in Reverse Order:");
     while (it.hasNext()) {
        System.out.println(it.next());
     }	 */		
			