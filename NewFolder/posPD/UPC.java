package posPD;

/**
 * This class represent a UPC. to help keep track of items UPC
 */
public class UPC {

	private Long uPC;
	//private Item item;

	public UPC() {
		// TODO - implement UPC.UPC
		throw new UnsupportedOperationException();
	}

	/**
	 * this constructor should get this upc value from the store
	 * The store holds a variable of type Long. This variable will be used to UPCs
	 * 
	 * @param upc
	 */
	public UPC(Long upc) {
		setUPC(upc);
		// TODO - implement UPC.UPC
		throw new UnsupportedOperationException();
	}
	
	/**
	 *Setter for UPC 
	 *parameter upc representing a newly created UPC
	 *@param upc
	 */
	public void setUPC(Long upc) {
		this.uPC = upc;
	}
	
	/**
	 * Getter for UPC
	 * returns a upc
	 */
	public Long getUPC() {
		return this.uPC;
	}

	public String toString() {
		// TODO - implement UPC.toString
		throw new UnsupportedOperationException();
	}

}