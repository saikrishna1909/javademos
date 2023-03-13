package pp16calculatorproject;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("````````````````````````````````````````````````");
		System.out.println("           Aritmetic Calculator");
		System.out.println("````````````````````````````````````````````````");
		System.out.println("Enter first operand");
		int a=sc.nextInt();
		System.out.println("Enter arithmetic operation");
		Operations op=new Operations();
		op.arithmeticCalci(a);
	}
}
class Operations{
	final public void arithmeticCalci(int a) {
		int res;
	Scanner sc=new Scanner(System.in);
	label1:System.out.println("Enter arithmetic operation");

	System.out.println("1 for Addition");
	System.out.println("2 for Subtraction");
	System.out.println("3 for Division");
	System.out.println("4 for Multiplication");
	int ch=sc.nextInt();
	if(ch==1) {
		System.out.println(a+" + ");
	}
	if(ch==2) {
		System.out.println(a+" - ");
	}
	if(ch==3) {
		System.out.println(a+" / ");
	}
	if(ch==4) {
		System.out.println(a+" * ");
	}
	System.out.println("Enter second operand");
	int b=sc.nextInt();
	if(ch==1) {
		System.out.println(a+" + "+b);
	}
	if(ch==2) {
		System.out.println(a+" - "+b);
	}
	if(ch==3) {
		System.out.println(a+" / "+b);
	}
	if(ch==4) {
		System.out.println(a+" * "+b);
	}
	ArithmeticOperations ao=new ArithmeticOperations(a,b);
	System.out.println("Press = for result");
	String s=sc.next();
	if(s.equals("=")) {
	switch(ch) {
	
	case 1:ao.addition();
			break;
	case 2:ao.subtraction();
	break;

	case 3:ao.division();
	break;

	case 4:ao.multiplication();
	break;

	}
	}
	System.out.println("Do you want to continue (yes or no) ?");
	String be=sc.next();
	if(be.equals("yes")) {
	System.out.println("Do you want to continue with previous result(yes or no ?");
	String bs=sc.next();
	if (bs.equals("yes")) {
		arithmeticCalci(ArithmeticOperations.c);
	}
	else {
		ArithmeticOperations.c=0;
		System.out.println("Enter first operand");
		int f=sc.nextInt();
		arithmeticCalci(f);
	}
	}
	
	}
}
class ArithmeticOperations{
	int a,b;
	static int c;
	ArithmeticOperations(int a,int b){
		this.a=a;
		this.b=b;
	}
	public void addition() {
		System.out.println((a+b));
		c=c+a+b;
	}
	public void subtraction() {
		
		System.out.println("Subtraction: "+a+" - "+b+" = "+(a-b));
		c=c+a-b;
	}
	public void division() {
		System.out.println("Division: "+a+" / "+b+" = "+(int)a/b);
		c=c+(int)a/b;
	}
	public void multiplication() {
		System.out.println("Multiplication: "+a+" * "+b+" = "+(a*b));
		c=c+a*b;
	}
}
