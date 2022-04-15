abstract class Vehicle{
	abstract void noOfWheels();
	
	abstract void engineCapacity();
}

abstract class TwoWheeler extends Vehicle{
	@Override
	void noOfWheels(){
		System.out.println("2 wheels");
	}
}

abstract class FourWheeler extends Vehicle{
	@Override
	void noOfWheels(){
		System.out.println("4 wheels");
	}
}

class Activa125 extends TwoWheeler{
	@Override
	void engineCapacity(){
		System.out.println("Activa:125CC");
	}
}

class I20 extends FourWheeler{
	@Override
	void engineCapacity(){
		System.out.println("I20:1200CC");
	}
}

class AbstractDemo1{
	public static void main(String... args){
		Vehicle v1 = new Activa125();
		Vehicle v2 = new I20();
		v1.noOfWheels();
		v2.noOfWheels();
		
		v1.engineCapacity();
		v2.engineCapacity();
		
		TwoWheeler twv = new Activa125();
		FourWheeler fwv = new I20();
		
		twv.noOfWheels();
		fwv.noOfWheels();
		
		twv.engineCapacity();
		fwv.engineCapacity();
		
	}
}