import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {

	private String myNumber;
	private ArrayList<Contact> myContacts;		//create an object of arraylist

	public MobilePhone(String myNumber) {
		this.myNumber=myNumber;
		this.myContacts = new ArrayList<Contact>();
	}
	//5
	public void printContacts() {
		for(int i=0; i<myContacts.size(); i++) {
			System.out.println((i+1)+ ". "+this.myContacts.get(i).getName() + " -> " + this.myContacts.get(i).getPhoneNumber());
		}
	}
	
	
	
	
	//4
	public boolean removeContact(Contact contact) {
		int foundPosition = findContact(contact);
		if(foundPosition < 0 ) {
			System.out.println( contact.getName() + " was not found");
			return false;
		}
		this.myContacts.remove(foundPosition);
		System.out.println( contact.getName() + " was deleted ");
		return true;
	}
	
	
	//3
	public String queryContact(Contact contact) {
		if(findContact(contact) >= 0) {
			return contact.getName();
		}
		return null;
	}
	
	//2
	public boolean updateContact(Contact oldContact, Contact newContact) {
		int foundPosition = findContact(oldContact);
		if(foundPosition < 0 ) {
			System.out.println( oldContact.getName() + " was not found");
			return false;
		}else if (findContact(newContact.getName()) != -1) {
			System.out.println("Contact with name "+ newContact.getName()+" already exists.");
			return false;
		}
		this.myContacts.set(foundPosition, newContact);
		System.out.println( oldContact.getName() + " was replaced with "+ newContact.getName());
		return true;
	}
	
	
	//1
	public boolean addNewContact(Contact contact) {
		 if(findContact(contact.getName()) >=0) {
			 System.out.println("Contact is already on file");
			 return false;
		 }
		 myContacts.add(contact);
		 return true;
	}
	private int findContact(String contactName) {
		for(int i=0; i<this.myContacts.size(); i++) { //loop over all contacts
			Contact contact = this.myContacts.get(i); //get their Name
			if (contact.getName().equals(contactName)) { //compare it
				return i;
			}
		} return -1;
	}
	
	private int findContact(Contact contact) {
		return this.myContacts.indexOf(contact);
	}
	
	
	//6
	public Contact queryContact(String name) {
		// TODO Auto-generated method stub
		int position= findContact(name);
		if(position >=0) {
			return this.myContacts.get(position);
		}
		return null;
	}
		
}