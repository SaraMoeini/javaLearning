package challenge;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListChallenges {

	private static Scanner scanner = new Scanner(System.in);
	
	private static ArrayList<String> groceryList = new ArrayList<String>( );		//create an object of arraylist
	//ArrayList listTest = new ArrayList( );		//create an object of arraylist

	public static void readElements() {

		boolean quit = true;
		String temp;
		do{
			System.out.println("enter elements");

			 temp = scanner.next();
			groceryList.add(temp);
			scanner.nextLine();				

			System.out.println("Do you want to continue entering numbers?(y/n)");
			temp = scanner.next();
			
		}while (temp.equals("y")) ;
		printgroceryList();
	}	
	
	public static void addgroceryItem(String item) {
		groceryList.add(item);
	}

	public static void printgroceryList() {
		System.out.print("you have "+groceryList.size()+"item in your ArrayList");;
		for(int i=0; i<groceryList.size(); i++) {
			System.out.print("grocery_"+(i+1)+" = "+groceryList.get(i)+" . ");
		}
	}
	
	public static void secondprintgroceryList() {

	Iterator it = groceryList.iterator( );
	System.out.println( "Enter the elements" );
	while ( it.hasNext( ) ) {		//
		System.out.print( it.next( ) + "\t" );
		}
	}
	public  String findItem(String searchItem) {
		//groceryList.contains(searchItem);
		
		int position = groceryList.indexOf(searchItem);
		if(position>=0) {
			return groceryList.get(position);
		}
		return null;
	}
	
	public ArrayList<String> getGroceryList(){
		return groceryList;
	}
	/*
	public static void copyArrayList() {
		ArrayList<String> firstCopy = new ArrayList<String>(groceryList.getGroceryList());
		
		ArrayList<String> secondCopy = new ArrayList<String>();
		secondCopy.addAll(groceryList.getGroceryList());
	} */ 
}
