
public class Main {
	/**
	 * Create an abstract class to define items that can be stored in a list. This class should contain 
	 * 2 references to items which will represent the next and previous items (in the case of linkedlist).
	 * if you call your abstract class listItem, then it would have 2 member variables of type ListItem 
	 * that will hold references to the next/right and previous/left ListItem.
	 * 
	 * The abstract class will also need to hold a value - try to be as flexible as possible 
	 * when defining the type of this value
	 * 
	 * The class will also need methods to move to the next item and back to the previous item, 
	 * and methods to set the next and methods items.
	 * 
	 * You should also specify a compareTo() method that takes a parameter of the same type as the class and
	 * returns 0 if the values are equal, greater than 0 if the value sorts greater than the parameter 
	 * and less than 0 if it sorts less than the parameter.
	 * 
	 *  Create a concrete class from your abstract list item class and use this in a LinkedList class to 
	 *  implement l LinkedList that will add items in order (so that they are sorted alphabetically)
	 *  Duplicate values are not added.
	 *  
	 *  Note that you are creating your own LinkedList class here, not using the built-in java one.
	 *  
	 *  The rules for adding an item to the Linked list are:
	 *  	If the head of list is null, make the head refer to the item to be added
	 *  	If the item to be added is less than the current item in the list, add the item before the 
	 *  		current item(make the previous item's "next" refer to the new item and the new item's
	 *  		"next" refer to the current item).
	 *  	If the item to be added is greater than the current item, move onto the next item and 
	 *  		compare again (if there is no next item then that is where the new item belongs)
	 *  
	 *  Care will be needed when inserting before the first item in the list (as it will not have a previous item)
	 *  
	 *  You will also need a method to remove an item from the list. 
	 *   
	 */
	public static void main(String[] args) {
		/*{
			MyLinkedList list = new MyLinkedList(null);
			list.traverse(list.getRoot());
			
			String stringData = "5 7 3 9 8 2 1 0 4 5 6";
			
			String[] data = stringData.split(" ");
			for (String s : data) {
				//create new item with value set to the string s
				list.addItem(new Node(s));
			}
			
			list.traverse(list.getRoot());
		}*/
		{
			SearchTree tree = new SearchTree(null);
			tree.traverse(tree.getRoot());
			
			String stringData = "5 7 3 9 8 2 1 0 4 5 6";
			
			String[] data = stringData.split(" ");
			for (String s : data) {
				//create new item with value set to the string s
				tree.addItem(new Node(s));
			}
			
			tree.traverse(tree.getRoot());
	
		}
	}
}
