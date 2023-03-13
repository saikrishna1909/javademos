package Inheritance;

public class BasicInhertConcepts {
	public static void main(String args[]) {
		Bus b=new Bus();
		b.prints();
	}
}
class Vehicle{
	Vehicle(){
		System.out.println("This is vehicle class");
	}
}
class Bus extends Vehicle{
	void prints() {
		System.out.println("This is child class");
	}
}