package methodoverriding;

public class MethodOverriding {
	public static void main(String args[]) {
		//Vehicle v=new Vehicle();
		//v.fuel();
		Bus b=new Bus();
		b.fuel();
		Bike bi=new Bike();
		bi.fuel();
	}
}
class Vehicle{
	void fuel() {
		System.out.println("Petrol");
	}
}
class Bus extends Vehicle{
	//Here we are doing overriding
	//Overriding is done when child class wants to show its own functionality if the functionality of
	//parent class different from child class
	void fuel() {
		super.fuel();
		System.out.println("Diesel");
	}
}
class Bike extends Vehicle{
	void fuel() {
		System.out.println("Petrol");
	}
}