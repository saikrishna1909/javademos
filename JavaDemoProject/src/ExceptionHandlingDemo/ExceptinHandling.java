package ExceptionHandlingDemo;
import java.util.Scanner;
public class ExceptinHandling {
	public static void main(String args[]) {
		int a,b;
		float c,d;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Two numbers");
		System.out.println("Enter one number:");
		a=sc.nextInt();
		System.out.println("Enter one more number:");
		b=sc.nextInt();
		try {
		c=a/b;
		d=a%b;
		System.out.println(a+"/"+b+"="+c+"Remainder:"+d);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}
