/* 1. Write a Java program to create a new tree set, add some fruits (string) and print out the tree set.
-Write a Java program to iterate through all elements in a tree set.
-Write a Java program to add all the elements of a specified tree set to another tree set.
-Write a Java program to create a reverse order view of the elements contained in a given tree set.
-Write a Java program to find the numbers less than 7 in a tree set. */

import java.util.*;

class CollectionsQ4{
	
	public static void main(String[] args){
		TreeSet<String> set = new TreeSet<String>();
		
		System.out.println("\nWrite a Java program to create a new tree set, add some fruits (string) and print out the tree set.");
		set.add("Apple");
		set.add("Pineapple");
		set.add("Orange");
		set.add("Banana");
		set.add("Chikku");
		set.add("Mango");
		
		System.out.println(set);
	
		System.out.println("\nWrite a Java program to iterate through all elements in a tree set.");
		for(String s : set){
			System.out.println(s);
		}
		
		System.out.println("\nWrite a Java program to add all the elements of a specified tree set to another tree set.");
		TreeSet<String> set1 = new TreeSet<String>();
		set1.add("Lime");
		set1.add("Strawberry");
		set1.add("Blue Berry");
		set.addAll(set1);
		System.out.println(set);
		
		System.out.println("\nWrite a Java program to create a reverse order view of the elements contained in a given tree set.");
		Iterator set2 = set.descendingIterator();
		while(set2.hasNext()){
			System.out.println(set2.next());
		}
		
		System.out.println("\nWrite a Java program to find the numbers less than 7 in a tree set.");
		
		
		
	}
}