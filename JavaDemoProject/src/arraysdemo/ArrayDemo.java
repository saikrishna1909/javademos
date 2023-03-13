package arraysdemo;

public class ArrayDemo {
	
//	
//	int a[]= {1,2,3,4,5,6,7,8};
//	a[0]=9;
//	a[3]=new Integer(10);
//	int sum=0;
//	sum+=5;
//	System.out.println(sum);
//	sum=5;
//	System.out.println(sum);
	public static void main(String args[]) {
		Vehicle v=new Car();
	}
}
interface Vehicle{
	public void print() ;
	
}
class Car implements Vehicle{
	public void print() {
		System.out.println("This is Parent class");
	}

}