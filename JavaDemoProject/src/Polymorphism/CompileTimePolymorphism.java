package Polymorphism;

public class CompileTimePolymorphism {
	public static void main(String args[]) {
		CompileTimePolymorphismDemo ctp = new CompileTimePolymorphismDemo();
		ctp.add(2,3);
		ctp.add(2.9f,3.4f);
		ctp.add(2,3,4);
		ctp.add("x","y");
		
	}
}
class CompileTimePolymorphismDemo{
		void add(int x,int y) {
			int result=x+y;
			System.out.println("Additiion of Integers:"+ result);
		}
		void add(float x,float y) {
			float result= x+y;
			System.out.println("Additiion of Floating points:"+result);
		}
		void add(int x,int y,int z) {
			int result=x+y+z;
			System.out.println("Additiion of Three Integers:"+result);
		}
		void add(String x,String y) {
			String result= x + y;
			System.out.println("Additiion of Strings:"+result);
		}
	}
	
