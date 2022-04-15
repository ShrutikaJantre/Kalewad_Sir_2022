import java.util.HashSet;

class HashSetDemo{
	
	public static void main(String[] args){
		HashSet<Rohit2> set = new HashSet<>();
		
		Rohit2 r1 = new Rohit2(1,"tejas","Samsung");
		Rohit2 r2 = new Rohit2(2,"Himanshu","Redmi");
		Rohit2 r3 = new Rohit2(3,"Kalyani","iphone");
		Rohit2 r4 = new Rohit2(1,"tejas","Samsung");
		Rohit2 r5 = new Rohit2(1,"tejas","Samsung");
		
		set.add(r3);//0
		set.add(r1);//1
		set.add(r4);//2
		set.add(r2);//3
		set.add(r5);//4
		
		
		System.out.println(set);//similar wala chodkar baki sabh print karega
		System.out.println(set.size());

	}

}

//uniqueness matters
//order doesnt matter
//print mai koi bhi kaise bhi print hoga
//jitna unique utna toString call hoga
//number of same object minus - 1 bar equals call hoga


