package challenge;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class LinkedListDemo {
	
	public static void Demo() {
		LinkedList<String> placesToVisit = new LinkedList<String>();
		/*
		placesToVisit.add("Sydney");
		placesToVisit.add("Melborne");
		placesToVisit.add("Brisbane");
		placesToVisit.add("Perth");
		placesToVisit.add("Canberra");
		placesToVisit.add("Adelaide");
		placesToVisit.add("Darwin");
		*/
		addInOrder(placesToVisit,"Sydney");
		addInOrder(placesToVisit, "Melborne");
		addInOrder(placesToVisit, "Brisbane");
		addInOrder(placesToVisit, "Perth");
		addInOrder(placesToVisit, "Canberra");
		addInOrder(placesToVisit, "Adelaide");
		addInOrder(placesToVisit, "Darwin");

		printList(placesToVisit);
		
		//placesToVisit.add(1, "Alice Springs");
		addInOrder(placesToVisit, "Alice Springs");
		addInOrder(placesToVisit, "Darwin");

		printList(placesToVisit);

		visit(placesToVisit);
		//placesToVisit.remove(4); //fifth element, position zero
		//printList(placesToVisit);
	}
	
	private static void printList(LinkedList<String> LinkedList) {
		Iterator<String> i = LinkedList.iterator();
		while (i.hasNext()) {
			System.out.println("Now visiting " + i.next());
		}
		System.out.println("---------------------------"); 
	}
	
	// add into alphabetic order
	private static boolean addInOrder(LinkedList<String> LinkedList, String newCity) {
		ListIterator<String> stringListIterator = LinkedList.listIterator();
		
		while(stringListIterator.hasNext()) {
			int comparison = stringListIterator.next().compareTo(newCity) ;
			if (comparison==0) {
				//equal, do not add
				System.out.println(newCity + " is already includeed as a destination");
				return false;
			} else if(comparison > 0 ) {
				//newCity should appear before this one 
				//Brisbane -> Adelaide
				stringListIterator.previous();
				stringListIterator.add(newCity);
				return true;
			} else if(comparison < 0 ) {
				//move on next city
			}
		}
		
		stringListIterator.add("newCity");
	    return true;
				
	}
	//method that gives you option to go visit forward or back
	private static void visit(LinkedList cities) {
		Scanner scanner = new Scanner(System.in);
		boolean quit = false;
		
		boolean goingForward = true;	// to solve the problem of loop in linkedlist with forward and back option
		
		ListIterator<String> listIterator = cities.listIterator();
		
		if(cities.isEmpty()) {
			 System.out.println("No cities in the itenerary");
			 return;
		} else {
			System.out.println("Now visiting "+listIterator.next());
			printMenu();
		}
		
		while (!quit) {
			int action = scanner.nextInt();
			scanner.nextLine();
			switch(action) {
			case 0: 
				System.out.println("Holiday over");
				quit = true;
				break;
			case 1:
				if(!goingForward) {
					if(listIterator.hasNext()) {
						listIterator.next();
					}
					goingForward = true;
				}
				if(listIterator.hasNext()) {
				System.out.println("Now visiting " + listIterator.next());
			} else {
				System.out.println("Reached the end of the list");
				goingForward = false;

			}
				break;
			case 2:
				if(goingForward) {
					if(listIterator.hasPrevious()) {
						listIterator.previous();
					}
					goingForward = false;
				}
				if(listIterator.hasPrevious()) {
					System.out.println("Now visiting "+ listIterator.previous());
				} else {
					System.out.println("We are at the start of the list");
				
					goingForward = true;
}
				break;
			case 3:
				printMenu();
				break;
			}
		}
	}	
	private static void printMenu() {
		System.out.println("Available actions : \n press :");
		System.out.println("0 - to quit\n" +
						   "1 - go to next city \n " +
						   "3 - print menue options");
	}


}

	