
public class Main {

	public static void main(String[] args) {
		
		Bank bank = new Bank("Societe General");
		bank .addBranch("Marseille");
		
		bank.addCustomer("Marseille", "Sara", 50.05);
		bank.addCustomer("Marseille", "Banafsheh", 175.34);
		bank.addCustomer("Marseille", "Rana", 220.12);
		
		bank.addBranch("Paris");
		bank.addCustomer("Paris", "Nahid", 150.54);

		bank.addCustomer("Marseille", "Sara", 44.22);
		bank.addCustomer("Marseille", "Sara", 12.44);
		bank.addCustomer("Marseille", "Banafsheh", 1.65);

		bank.listCustomers("Marseille", true);
	}
}
