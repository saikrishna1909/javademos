package constructorproject;

public class ConstructorDemo {
	int n;
	public ConstructorDemo() {
		n=5;
		System.out.println("This is constructor");
	}
	{//it takes n as 0(default value)
		System.out.println("This is Block"+n);
	}
	public void myMethod() {
		System.out.println("This is myMethod");
	}
	public static void main(String args[]) {
		ConstructorDemo myObj=new ConstructorDemo();
		myObj.myMethod();
	}
	
}
