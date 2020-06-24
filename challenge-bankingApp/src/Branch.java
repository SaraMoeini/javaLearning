import java.util.ArrayList;

public class Branch {
	
	private String name;
	ArrayList<Customer> customers;	
	 
	public Branch(String name) {
		this.name = name;
		this.customers = new ArrayList<Customer>(); //initialize in constructor

	}

	public String getName() {
		return name;
	}

		
	public ArrayList<Customer> getCustomers() {
		return customers;
	}

	// add a new customer 
	public boolean newCustomer(String customerName, double initialAmount) {
		if(findCustomer(customerName) == null) {
			this.customers.add(new Customer(customerName, initialAmount));
			return true;
		}
		return false;
	}
	
	//add a new transaction to a customer
	public boolean addCustomerTransaction(String customerName, double amount) {
		Customer existingCustomer = findCustomer(customerName);
		if(existingCustomer != null) {  
			existingCustomer.addTransaction(amount);
			return true;
		}
		return false;
	}
	
	//is it a new customer or already exists?
	private Customer findCustomer(String customerName) {
		for(int i=0; i<this.customers.size(); i++) {
			Customer checkedCustomer = this.customers.get(i); // this is just for better comprehention

			if(checkedCustomer.getName().equals(customerName)) {
				return checkedCustomer;
			}
			
		}
		return null;
	}
	
	 
}
