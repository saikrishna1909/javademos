package predicatedemo;
import java.util.function.Predicate;
public class PredicateDemo {
	public static void main(String args[]) {
	Predicate<Integer> Even=(i)->((i%2)==0);
	int a[]= {2, 3 ,4 ,5,6,7,8,9};
	for(int i:a) {
		if(Even.test(i)) {
			System.out.println(i);
		}
	}
//	Summation sum=(x,y)->{return x+y;};
	
}
}
