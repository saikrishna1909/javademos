package abstraction;

public class DiamondProblem {
	public static  void main(String args[]) {
		Samsung sa=new Samsung();
		sa.powerOn();
	}
}
interface ElectronicDevice{
	public default void poweron() {
		System.out.println("Poer is on for ed");
	}
}
interface TV extends ElectronicDevice{
	public default void powerOn() {
		System.out.println("TV is poered on");
	}
}
interface Fan extends ElectronicDevice{
	public default void powerOn() {
		System.out.println("Fan Power is on");
		
	}
}
class Samsung implements TV, Fan{

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		Fan.super.powerOn();
	}
	
}