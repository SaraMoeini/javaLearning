
public interface NodeList {

	boolean addItem(ListItem item);

	ListItem getRoot();

	boolean removeItem(ListItem item);

	void traverse(ListItem root);

}
