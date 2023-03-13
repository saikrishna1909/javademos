package innerclass;

public class InnerclassDemo {
	public static void main() {
		ElectronicDevice.poweron();
	}
}
class ElectronicDevice{
	static void poweron() {
		System.out.println("Power is on");
	}
	static class Processor{
		static void displayBrand() {
			System.out.println("This is the brand");
		}
		void getVoltage() {
			System.out.println("This is thevoltage");
		}
	}
	class Memory{
		static void size() {
			System.out.println("This is the size");
		}
		void brand() {
			System.out.println("This is the memory brand");
		}
	}
}
