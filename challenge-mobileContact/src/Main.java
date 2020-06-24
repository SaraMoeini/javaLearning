import java.util.Scanner;
/**
 * 
 * @author sara
 * ArrayList exercise
 */
public class Main {

	private static Scanner scanner = new Scanner(System.in);
	private static MobilePhone mobilePhone = new MobilePhone("06 8654 56 25");
	public static void main(String[] args) {

		boolean quit = false;
		startPhone();
		printActions();
		while(!quit) {
			System.out.println("\n Enter action : (6 to show available actions)");
			int action = scanner.nextInt();
			scanner.nextLine();
			
			switch (action) {
			case 0:
				System.out.println("\nShutting down ...");
				quit=true;
				break;
			case 1:
				mobilePhone.printContacts();
				break;
			case 2:
				addNewContact();
				break;
			case 3:
				updateContact();
				break;
			case 4:
				removeContact();
				break;
			case 5:
				queryContact();
				break;
			case 6:
				printActions();
				break;
			}
		}
		
	}
	
	

	private static void queryContact() {
		System.out.println("Enter existing contact");
		String name = scanner.nextLine();
		Contact existingContactRecord = mobilePhone.queryContact(name);
		if(existingContactRecord == null) {
			System.out.println("Contact not found");
			return;
		}
		System.out.println("Name: "+ existingContactRecord.getName() +" has number: "+ existingContactRecord.getPhoneNumber()); 
	}



	private static void removeContact() {
		System.out.println("Enter existing contact name ");
		String name = scanner.nextLine();
		Contact existingContactRecord = mobilePhone.queryContact(name);
		if(existingContactRecord == null) {
			System.out.println("Contact not found");
			return;
		}		
		if(mobilePhone.removeContact(existingContactRecord)) {
			System.out.println("Contact deleted");
		} else {
			System.out.println("Error deleting contact");
		}
	}



	private static void updateContact() {
		System.out.println("Enter existing contact name ");
		String name = scanner.nextLine();
		Contact existingContactRecord = mobilePhone.queryContact(name);
		if(existingContactRecord == null) {
			System.out.println("Contact not found");
			return;
		}
		System.out.println("Enter new contact name");
		String newName=scanner.nextLine();
		System.out.println("Enter new contact phone number");
		String newPhone = scanner.nextLine();
		Contact newContact = Contact.createContact(newName, newPhone);
		if(mobilePhone.updateContact(existingContactRecord, newContact)) {
			System.out.println("Successfully updated");
		} else {
			System.out.println("Error updating record");
		}
	}



	private static void addNewContact() {
		System.out.println("Enter new contact name");
		String name = scanner.nextLine();
		System.out.println("Enter phone number");
		String phone = scanner.nextLine();
		Contact newContact = Contact.createContact(name, phone);
		if(mobilePhone.addNewContact(newContact)) {
			System.out.println("new Contact added: name = "+ name + " ,phone = " + phone);
		} else {
			System.out.println("Can not add. "+ name +" already on file");
		}
	}



	private static void printActions() {
		System.out.println("\nAvailable actions : \nPress");
		System.out.println("0 - to shutdown\n" +
						   "1 - to print contacts\n" +
				           "2 - to add a new contact\n" +
						   "3 - to update an existing contact\n" +
				           "4 - to remove an existiong contact\n" +
						   "5 - query if a contact exits\n" +
				           "6 - to print a list of available actions");
		System.out.println("Choose your action: ");



	}
	
	private static void startPhone() {
		System.out.println("\nStarting phone...");
		
	}
}
