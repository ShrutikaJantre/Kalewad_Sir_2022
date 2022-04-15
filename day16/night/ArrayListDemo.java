import java.util.*;

class ArrayListDemo{
	
	public static void main(String[] args){
		ArrayList<Rohit2> list = new ArrayList<>();
		
		Rohit2 r1 = new Rohit2(1,"tejas","Samsung");
		Rohit2 r2 = new Rohit2(2,"Himanshu","Redmi");
		Rohit2 r3 = new Rohit2(3,"Kalyani","iphone");
		Rohit2 r4 = new Rohit2(1,"tejas","Samsung");
		
		list.add(r3);//0
		list.add(r1);//1
		list.add(r4);//2
		list.add(r2);//3
		list.add(r1);//4
		list.add(r4);//5
		list.add(r3);//6
		
		
		System.out.println(list);
		System.out.println(list.contains(r1));
		System.out.println(list.get(3));//index will par jo hoga vo print hoga
		System.out.println(list.indexOf(r4));//it will check the object data is present at which index// yeha equals matter karta hai 
		System.out.println(list.lastIndexOf(r4));//where r4 content is located actually from last
		System.out.println(list.lastIndexOf(r1));
		System.out.println(list.lastIndexOf(r3));
		
		Collections.sort(list);
		System.out.println(list);
	}

}

//ordered
//no uniqueness (no fucks given to equals)
