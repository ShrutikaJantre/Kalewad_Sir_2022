// 1. Write a Java program to create a new array list, add some Movie names (string) and print out the collection.
// -Write a Java program to insert an element into the array list at the first -position.
// -Write a Java program to retrieve an element (at a specified index) from a given array list.
// -Write a Java program to update specific array element by given element.
// -Write a Java program to remove the third element from a array list.
// -Write a Java program to search an element in a array list.
// -Write a Java program to sort a given array list.
// -Write a Java program to reverse elements in a array list.
// -Write a Java program to empty an array list.


import java.util.*;

class CollectionsQ1{
	
	public static void main(String[] args){
		
		ArrayList<String> list = new ArrayList<>();
		
		list.add("Saawariya");
		list.add("Barfi");
		list.add("Wake up Sid");
		list.add("Tamasha");
		list.add("Brahmastra");
		
		System.out.println("\nWrite a Java program to create a new array list, add some Movie names (string) and print out the collection.");
		System.out.println(list.size());
		System.out.println(list);
		
		System.out.println("\nWrite a Java program to insert an element into the array list at the first -position.");
		list.add(0, "Ae dil hai Mushkil");
		System.out.println(list.size());
		System.out.println(list);
		
		System.out.println("\nWrite a Java program to retrieve an element (at a specified index) from a given array list.");
		System.out.println(list.get(4));
		
		System.out.println("\nWrite a Java program to update specific array element by given element.");
		list.set(3, "Roy");
		System.out.println(list.size());
		System.out.println(list);
		
		System.out.println("\nWrite a Java program to remove the third element from a array list.");
		list.remove(2);
		System.out.println(list.size());
		System.out.println(list);
		
		System.out.println("\nWrite a Java program to search an element in a array list.");
		System.out.println(list.contains("Roy"));
		System.out.println(list.contains("Barfi"));
		
		System.out.println("\nWrite a Java program to sort a given array list.");
		Collections.sort(list);
		System.out.println(list);
	
		System.out.println("\nWrite a Java program to reverse elements in a array list.");
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
		
		System.out.println("\nWrite a Java program to empty an array list.");
		System.out.println(list.removeAll(list));
		System.out.println(list);
	}
	
	
}