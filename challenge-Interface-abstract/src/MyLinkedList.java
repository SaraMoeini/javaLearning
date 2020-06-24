
public class MyLinkedList implements NodeList{

	private ListItem root = null;
	
	public MyLinkedList(ListItem root) {
		this.root = root;
	}

	@Override
	public ListItem getRoot() {
		return this.root;
	}

	@Override
	public boolean addItem(ListItem newItem) {
		if(this.root == null) {				//if List is Empty
			this.root = newItem;	//so this item becomes the head of the list 
			return true;
		}
		ListItem currentItem = this.root;	//this item becomes the head
		while(currentItem != null) {
			int comparison=(currentItem.compareTo(newItem));
			if(comparison<0) {	//newItem is greater => move right if possible
				if(currentItem.next() != null) {
					currentItem = currentItem.next();
				} else {	//when there is no next
					currentItem.setNext(newItem); //insert at the end of list
					newItem.setPrevious(currentItem);
					return true;
				}
			} else if(comparison > 0) {	//newItem is less => insert before the currentItem
				if(currentItem.previous() != null) {	
					currentItem.previous().setNext(newItem);
					newItem.setPrevious(currentItem.previous());
					newItem.setNext(currentItem);
					currentItem.setPrevious(newItem);
				} else {	//the node with a previous is the root
					newItem.setNext(this.root);
					this.root.setPrevious(newItem);
					this.root=newItem;
				}
				return true;
			} else { 	//equal
				System.out.println(newItem.getValue() + " is already present, not inserted.");
				return false;
			}
		}
		return false;
	}

	@Override
	public boolean removeItem(ListItem item) {
		if (item != null) {
			System.out.println("Deleting "+item.getValue());
		}
			ListItem currentItem = this.root;		
			while(currentItem != null) {
				int comparison=(root.compareTo(item));
				if(comparison == 0) {	// item found
					if (currentItem == this.root) {//verify if this item is the first entry
						this.root = currentItem.next();
					} else {
						currentItem.previous().setNext(currentItem.next()) ; //one step move forward
						if(currentItem.next() != null) {
							currentItem.next().setPrevious(currentItem.previous());
						}
					}
					return true;
				} else if (comparison < 0) {
					currentItem = currentItem.next(); 	//navigate through the linkedlist
				} else { //comparison > 0   ==>   we are at an item greater than the one to be deleted
					// so the item is not in the list
					return false;
				}
			}
			//we've reached the end of list without finding item to delete
			return false; 
	}

	@Override
	public void traverse(ListItem root) {
		if (root == null) {
			System.out.println("List is empty. ");
		} else {
			while(root != null) {
				System.out.println(root.getValue());
				root = root.next();
			}
		}
	}
	

}
