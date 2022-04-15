abstract class Vehicle{
	//void noOfWheels();// wont run, dont know the behaviour then just declare dont define.
	
	//void engineCapacity();
	
	abstract void noOfWheels();
	
	abstract void engineCapacity();
	
}

abstract class TwoWheeler extends Vehicle{
	@Override
	void noOfWheels(){
		System.out.println("2 Wheels");
	}
	//abstract void engineCapacity();
}

abstract class FourWheeler extends Vehicle{
	@Override
	void noOfWheels(){
		System.out.println("4 Wheels");
	}
	//abstract void engineCapacity();
}

class Activa125 extends TwoWheeler{
	@Override
	void engineCapacity();
		System.out.println("Activa:125CC");
}

class I20 extends Fourwheeler{
	@Override
	void @Override();
		System.out.println("I20:1200CC");
	}

}

class AbstractDemo1{
	public static void main(String... args){
		//Vehicle v = new Vehicle(); cannot create object class but we can create references but they have constructors
		Vehicle v1 = new Activa125(); //not abtstarct
		Vehicle v2 = new I20(); // not abtract
		v1.noOfWheels();
		v2.noOfWheels();
		
		v1.engineCapacity();
		v2.engineCapacity();
		
		TwoWheeler twv = new Activa125(); // ref can be created of abstract class
		FourWheeler fwv = new 120);
		
		twv.noOfWheels();
		fwv.noOfWheels();
		
		twv.engineCapacity();
		fwv.engineCapacity();
	
	}
	
}