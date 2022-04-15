// *Assignment 
// Create a person CL’S with age ,name ,gender adarcard ,city ,state ,pincode,and 
// override tostring equals and hashcode methods of the object class.*

class Himanshu{
	private String name;
	private Integer age;
	private String city;
	
	public Himanshu(String name, Integer age, String city){
		this.name = name;
		this.age = age;
		this.city = city;
		
	}
	
	
	@Override
	public String toString(){
		System.out.println("toString invoked!!!");
		return this.name+", " +this.age+", "+this.city;
	}
	
	@Override
	public boolean equals(Object o){
		System.out.println("equals invoked!!!!");
		if(o instanceof Himanshu){
			Himanshu temp = (Himanshu)o;
			if(this.name.equals(temp.name)&&
			this.age.equals(temp.age)&&
			this.city.equals(temp.city))
			{
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode(){
		System.out.println("Hascode invoked!!");
		int prime = 17;
		prime = prime + prime*this.name.hashCode();
		prime = prime + prime*this.age.hashCode();
		prime = prime + prime*this.city.hashCode();
		return prime;
	}
	
}

/* class Adami{
	
	public static void main(String[] args){
		Himanshu h1 = new Himanshu("Gopal", 23, "Shegaon");
		Himanshu h2 = new Himanshu("Jayant", 24, "Jalgaon");
		Himanshu h3 = new Himanshu("Gopal", 23, "Shegaon");
		
		System.out.println(h1);
		System.out.println(h2);
		System.out.println(h3);
		
		System.out.println("h1 == h3: "+(h1 == h3));
		System.out.println("h1.equals(h3): "+h1.equals(h3));
		
		System.out.println("h1.hashCode():" +h1.hashCode());
		System.out.println("h3.hashCode()" +h3.hashCode());
		
	
	}

} */


/* Himanshu@15db9742
Himanshu@6d06d69c
Himanshu@7852e922 */

/* 366712642
1829164700 */