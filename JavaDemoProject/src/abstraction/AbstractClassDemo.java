package abstraction;

public class AbstractClassDemo {
	public static void main(String args[]) {
		Bike acd=new Bike();
			acd.fuel();
	}
}
abstract class Vehicle{
	abstract void fuel();
}
class Bike extends Vehicle{
	void fuel() {
		System.out.println("Petrol");
	}
}