
public class Hamburger {
	
	private String name;
	private String breadRollType;
	private String meat;
	private double  price;

	private String addition1Name;
	private double  addition1Price;

	private String addition2Name;
	private double  addition2Price;

	private String addition3Name;
	private double  addition3Price;

	private String addition4Name;
	private double  addition4Price;

	
	public Hamburger(String name, String breadRollType, String meat, double price) {
		this.name = name;
		this.breadRollType = breadRollType;
		this.meat = meat;
		this.price = price;
	}



	public void addAddition1(String name, double price) {
		this.addition1Name = name;
		this.addition1Price = price;
	}
	public void addAddition2(String name, double price) {
		this.addition2Name = name;
		this.addition2Price = price;
	}
	public void addAddition3(String name, double price) {
		this.addition3Name = name;
		this.addition3Price = price;
	}
	public void addAddition4(String name, double price) {
		this.addition4Name = name;
		this.addition4Price = price;
	}
	
	public double itemizeHamburger() {
		double hamburgerPrice = this.price;
		System.out.println(this.name + "hamburger : " +
	 	this.breadRollType + " roll, price is "+ this.price);;
	 
	 	if(this.addition1Name != null) {
	 		hamburgerPrice += this.addition1Price;
	 		System.out.println("Added "+ this.addition1Price + " for an extra " + this.addition1Name);
	 	}
	 	if(this.addition2Name != null) {
	 		hamburgerPrice += this.addition2Price;
	 		System.out.println("Added "+ this.addition2Price + " for an extra " + this.addition2Name);
	 	}
	 	if(this.addition3Name != null) {
	 		hamburgerPrice += this.addition3Price;
	 		System.out.println("Added "+ this.addition3Price + " for an extra " + this.addition3Name);
	 	}
	 	if(this.addition4Name != null) {
	 		hamburgerPrice += this.addition4Price;
	 		System.out.println("Added "+ this.addition4Price + " for an extra " + this.addition4Name);
	 	}
	 	return hamburgerPrice;
	}
}
