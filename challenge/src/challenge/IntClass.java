package challenge;
/**
 * AutoBoxing & OnBoxing => beacause 
 * we can't have arraylist of primaritive variables
 * @author sara
 * we call it a wrapper
 */
public class IntClass {

	private int myValue;

	public IntClass(int myValue) {
		this.myValue = myValue;
	}

	public int getMyValue() {
		return myValue;
	}

	public void setMyValue(int myValue) {
		this.myValue = myValue;
	}
}
