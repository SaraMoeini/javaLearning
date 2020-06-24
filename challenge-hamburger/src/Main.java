
public class Main {

	public static void main(String[] args) { 
		Hamburger hamburger = new Hamburger("Basic", "Sausage", "white", 3.56);
		double price = hamburger.itemizeHamburger();
		hamburger.addAddition1("Tomato", 0.27);
		hamburger.addAddition1("Lettuce", 0.75);
		hamburger.addAddition1("Cheese", 1.12);
		System.out.println("Total burger price is "+hamburger.itemizeHamburger());
	
		
		HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
		healthyBurger.addAddition1("Egg", 2.5);
		System.out.println("Total price of health burger is "+ healthyBurger.itemizeHamburger());
	
		
		DeluxeBurger db = new DeluxeBurger();
		db.addAddition1("Tomato", 0.27);
		System.out.println("Total price of deluxe burger is "+ db.itemizeHamburger());
		
	}
}
 