
public class DeluxeBurger extends Hamburger {

	public DeluxeBurger() {
		super("Deluxe", "Sausage & Bacon", "white", 14.45);
		super.addAddition1("Chips", 2.75);
		super.addAddition2("Drink", 1.80);
		
		
	}

	@Override
	public void addAddition1(String name, double price) {
		System.out.println("Can not add additional item to deluxe burger");
	}

	@Override
	public void addAddition2(String name, double price) {
		// TODO Auto-generated method stub
		System.out.println("Can not add additional item to deluxe burger");
	}

	@Override
	public void addAddition3(String name, double price) {
		// TODO Auto-generated method stub
		System.out.println("Can not add additional item to deluxe burger");
	}

	@Override
	public void addAddition4(String name, double price) {
		// TODO Auto-generated method stub
		System.out.println("Can not add additional item to deluxe burger");
	}
}
