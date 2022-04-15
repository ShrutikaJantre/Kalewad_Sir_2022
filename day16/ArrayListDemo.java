import java.util.ArrayList;

class ArrayListDemo{
	public static void main(String[] args){
		ArrayList list = new ArrayList();// Non-generice collection
		
		list.add(10);//1
		list.add(20);
		list.add(0, 5);
		list.add("Abc");
		list.add(new Double("20.0"));
		list.add(null);

		System.out.println(list.size());
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		System.out.println(list.get(4));
		
		ArrayList <Integer> list2 = new ArrayList <> ();
		list2.add(10);
		list2.add(20);
		list2.add(30);
		//list2.add(3, 30);//insert obj at this index
		//list2.add(4, 30);//IOOBE
		list2.add(40);
		list2.add(50);
		list2.add(50);
		list2.add(60);
		//list2.add(5,60);
		System.out.println(list2);
		
		list2.remove(0);//Zeroth index ko delete karegaa
		System.out.println(list2);
		list2.remove(2);
		//list2.remove(50);//50 considered as index
		System.out.println(list2);
		list2.remove(new Integer(50));
		System.out.println(list2);
		
		boolean contains = list2.contains(10);//search for 10
		contains = list2.contains(new Integer(10));//search for 10
		
		System.out.println(list.size());
		
		list2.set(0, 100);
		System.out.println(list2);//toString methods of ArrayList
		
		for(int i=0; i<list2.size(); i++){
			System.out.print(list2.get(i)+" ");
		}
		System.out.println();
		for(Integer val: list2){
			System.out.print(val+" ");
		}
		
		ArrayList <String> list3 = new ArrayList <> ();
		list3.add("A");
		//list3.add(1);//error
		list3.add("B");
		list3.add("C");
		list3.add(3, "D");
		//list3.add(6, "E");// IndexOutOfBoundsException
		list3.add("E");
		list3.add("F");
		list3.add("G");
		list3.remove(0);
		list3.remove("D");
		
		System.out.println(list3);
		System.out.println(list3.indexOf("L"));//-1;
		System.out.println(list3.lastIndexOf("F"));
		
		System.out.println(list3.contains("F"));
		
		for(String s:list3){
			System.out.println(s);
		}
	}

}