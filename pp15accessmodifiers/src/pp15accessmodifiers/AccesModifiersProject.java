package pp15accessmodifiers;

public class AccesModifiersProject {
	public static void main(String args[]) {
		Rupees r=new Rupees();
		Dollars d=new Dollars();
		Euro e=new Euro();
		e.printEuroAmount();
	}
}
class Rupees{
	private int amount;
	Rupees(){
		amount=100;
	}
	void printRupeesAmount() {
		System.out.println("Rupees Amount = "+amount);
	}
	private void msg() {
		System.out.println("This is private method");
	}
}

class Dollars extends Rupees{
	protected int amount;
	Dollars(){
		amount=200;
	}
	protected void printDollarsAmount() {
		printRupeesAmount();
		System.out.println("Dollars Amount = "+amount);
	}
}
class Euro extends Dollars{
	public int amount;
	Euro(){
		amount=300;
	}
	public void printEuroAmount() {
		printDollarsAmount();
		
		System.out.println("Euro Amount = " + amount);
	}
}
