
public abstract class ListItem {
	
	protected ListItem rightLink = null;
	protected ListItem leftLink = null;
	
	protected Object value;
	
	public ListItem(Object value) {
		this.value=value;
	}
	//methods to move to the next item and back to the previous item
	//methods to set the next and methods items
	
	abstract ListItem next();
	abstract ListItem setNext(ListItem item);
	
	abstract ListItem previous();
	abstract ListItem setPrevious(ListItem item);
	
	abstract int compareTo(ListItem item);

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}
	
	
}
