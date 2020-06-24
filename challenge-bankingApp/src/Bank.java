import java.util.ArrayList;
/**
 * 
 * @author sara
 * the ability to add a new branch
 * and to add a customer to that branch with initial transaction amount 
 * also to add transactions for an existing customer for that branch
 * finally to show a list of customers for the particular branch and optionally 
 * display a list of the transactions for those customers.
 */
public class Bank {

	private String name; 
	ArrayList<Branch> branches; 
	
	public Bank(String name) {
		this.name = name;
		this.branches = new ArrayList<Branch>();	//initialize in constructor
	}
	
	public boolean addBranch(String branchName) {
		if(findBranch(branchName) == null) {
			this.branches.add(new Branch(branchName));
			return true;
		}
		return false;
	}
	public boolean addCustomer(String branchName, String customerName, double initialAmount) {
		if(findBranch(branchName) !=null ) {
			return findBranch(branchName).newCustomer(customerName, initialAmount); //
		}
		return false;
	}
	public boolean addCustomerTransaction(String branchName, String customerName, double amount) {
		Branch branch = findBranch(branchName);
		if (branch != null) {
			return branch.addCustomerTransaction(customerName, amount);
		}
		return false;
	}
	
	private Branch findBranch(String branchName) {
		for(int i=0; i<this.branches.size(); i++) {
			Branch checkedBranch = this.branches.get(i);
			if (checkedBranch.getName().equals(branchName)) {
				return checkedBranch;
			}
		}
		return null;
	}
	
	

	public boolean listCustomers(String branchName, boolean showTransactions) {
		Branch branch = findBranch(branchName);
		if (branch != null) {
			System.out.println("Customer detail for branch: "+ branch.getName());
			
			ArrayList<Customer> branchCustomers = branch.getCustomers();
			for(int i=0; i<branchCustomers.size(); i++) {
				Customer branchCustomer = branchCustomers.get(i);
				System.out.println("Customer: "+ branchCustomer.getName() + "["+i+"]");
				if(showTransactions) {
					System.out.println("Transactions");
					ArrayList<Double> transactions = branchCustomer.getTransactions();
					for(int j=0; j<transactions.size(); j++) {
						System.out.println("["+(j+1)+"] Amount "+ transactions.get(j) );
					}
				}			
			}
			return true;	
		} else return false;	
	}
}