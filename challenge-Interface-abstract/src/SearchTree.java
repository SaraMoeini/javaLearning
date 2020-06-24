
public class SearchTree implements NodeList{
	
	private ListItem root = null;
	
	public SearchTree(ListItem root) {
		this.root = root;
	}

	@Override
	public boolean addItem(ListItem newItem) {
		if(this.root == null) {
			this.root = newItem;
			return true;
		}//otherwise, start comparing from the head
		
		ListItem currentItem = this.root;
		while(currentItem != null) {
			int comparison = (currentItem.compareTo(newItem));
			if(comparison < 0) {	//newItem is greater ==> move right if possible
				if(currentItem.next() != null) {
					currentItem = currentItem.next(); 
				} else {	//there is no node to the right, so add it here
					currentItem.setNext(newItem);
					return true;
				}
			} else
			if (comparison > 0) {	//newItem is less, move left if possible
				if(currentItem.previous() != null) {
					currentItem = currentItem.previous();
				} else {	//there is no node to the left, so add it here
					currentItem.setPrevious(newItem);
					return true;
				}
			} else { //equal ==> don't add
				System.out.println(newItem.getValue() + " is already present.");
				return false;
			}
		}
		return false;
	}

	@Override
	public ListItem getRoot() {
		return this.root;
	}

	@Override
	public boolean removeItem(ListItem item) {
		return false;
	}

	@Override
	public void traverse(ListItem root) {	//recursive method
		if (root != null) {
			traverse(root.previous()); //left node
			System.out.println(root.getValue());
			traverse(root.next());
		}
	}

}
