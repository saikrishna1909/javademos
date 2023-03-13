package abstraction;

public class InterfaceDemo {
	public static void main(String args[]) {
		Bus b=new Bus();
		b.fuel();
	}
}
interface Vehicles{
	void fuel();
}
class Bus implements Vehicles{
	public void fuel() {
		System.out.println("Petrol");
	}
}
