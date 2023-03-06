package pp13typecasting;

import java.util.Scanner;

public class TypeCastingProject {
	public static void main(String args[]) {
		TypeCasting tc=new TypeCasting();
		tc.implicitCast();
		tc.explicitCast();
	}
}
class TypeCasting{
	void implicitCast() {
		System.out.println("````````````````````````````````````````````````````````````````````````````````````````");
		System.out.println("````````````````````````````````````````````````````````````````````````````````````````");
		System.out.println("                         TYPE CASTING               ");
		System.out.println("````````````````````````````````````````````````````````````````````````````````````````");
		System.out.println("````````````````````````````````````````````````````````````````````````````````````````");
		System.out.println("                       Implicit Type Casting");
		System.out.println("Enter an integer value to a");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		long l=a;
		System.out.println("Value of a when type casted to long implicitly and assigned to l:"+l);
		float b=l;
		System.out.println("Value of l when type casted to float implicitly and assigned to b:"+b);
		
		double c=b;
		System.out.println("Value of b when type casted to double implicitly and assigned to c:"+c);
		System.out.println("````````````````````````````````````````````````````````````````````````````````````````");
	
		
	}
	void explicitCast() {
		System.out.println("                       Explicit type casting");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number of double type length:");
		double d=sc.nextDouble();
		System.out.println("Value of d:"+d);
		float f=(float)d;
		System.out.println("Value of d after convert into float:"+f);
		int i=(int)d;
		System.out.println("Value of d after convert into integer:"+i);
		System.out.println("````````````````````````````````````````````````````````````````````````````````````````");

	}
}
