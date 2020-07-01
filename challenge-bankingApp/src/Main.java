/**
 * 
 * @author sara
 * the ability to add a new branch
 * and to add a customer to that branch with initial transaction amount 
 * also to add transactions for an existing customer for that branch
 * finally to show a list of customers for the particular branch and optionally 
 * display a list of the transactions for those customers.
 */
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
