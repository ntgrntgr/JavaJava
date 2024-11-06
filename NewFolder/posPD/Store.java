package posPD;

import java.util.*;

/**
 * This is the instance of the store it has all the info to know about a store
 */
public class Store {

	private Long number;
	private String name;
	private ArrayList<Session> sessions;
	private ArrayList<TaxCategory> taxCategories;
	private TreeMap<Long,Item> items;
	private TreeMap<Long,Cashier> cashiers;
	private TreeMap<Long,Register> registers;
	private ArrayList<UPC> upcs;
	private ArrayList<Long> cashierIDs;
	private Long registersCount;
	private Long cashiersCount;
	private Long itemCount;
	
	
	

	/**
	 * @return the registersCount
	 */
	public Long getRegistersCount() {
		return registersCount;
	}

	/**
	 * @param registersCount the registersCount to set
	 */
	public void setRegistersCount(Long registersCount) {
		this.registersCount = registersCount;
	}

	/**
	 * @return the cashiersCount
	 */
	public Long getCashiersCount() {
		return cashiersCount;
	}

	/**
	 * @param cashiersCount the cashiersCount to set
	 */
	public void setCashiersCount(Long cashiersCount) {
		this.cashiersCount = cashiersCount;
	}

	/**
	 * @return the itemCount
	 */
	public Long getItemCount() {
		return itemCount;
	}
	
	/**
	 * this resets the items count
	 * 
	 */
	public void resetItemCount() {
		this.itemCount = 1L;
	}

	/**
	 * @param itemCount the itemCount to set
	 */
	public void incrementItemCount() {
		this.itemCount++;
	}
	
	public void decrementItemCount() {
		this.itemCount--;
	}

	public Long getNumber() {
		return this.number;
	}

	public void setNumber(Long number) {
		this.number = number;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Store() {
		// TODO - implement Store.Store
		throw new UnsupportedOperationException();
	}

	/**
	 * sets the name and number of the store
	 * parameters number of the store number , name for the store name
	 * @param numberr
	 * @param name
	 */
	public Store(Long numberr, String name) {
		// TODO - implement Store.Store
		this.name = name;
		this.setRegistersCount(1L);
		this.setCashiersCount(1L);
		this.resetItemCount();
		throw new UnsupportedOperationException();
	}

	/**
	 * finds the item for a give UPC
	 * parameters upc for the UPC to find an item for
	 * returns item
	 *  
	 * @param upc
	 */
	public Item findItemForUPC(String upc) {
		// TODO - implement Store.findItemForUPC
		throw new UnsupportedOperationException();
	}

	/**
	 * finds the cashier give the number
	 * parameters number for the cashier number
	 * @param number
	 */
	public Cashier findCashierForNumber(String number) {
		// TODO - implement Store.findCashierForNumber
		throw new UnsupportedOperationException();
	}

	/**
	 * adds and item
	 * parameters item for an item to be added
	 * @param item
	 */
	public void addItem(Item item) {
		// TODO - implement Store.add
		this.items.put(item.getUPC().getUPC(),item);
		this.upcs.add(item.getUPC());
		this.incrementItemCount();
		throw new UnsupportedOperationException();
		
	}
	/**
	 * remove item
	 * parameters item for the item to be removed from the store
	 * @param item
	 */
	public void removeItem(Item item) {
		// TODO - implement Store.remove
		this.items.remove(item.getUPC().getUPC());
		this.upcs.remove(item.getUPC());
		this.decrementItemCount();
		throw new UnsupportedOperationException();
	}

	/**
	 * adds a upc
	 * parameters upc for the UPC to be added
	 * @param upc
	 */
	public void addUPC(UPC upc) {
		// TODO - implement Store.addUPC
		throw new UnsupportedOperationException();
	}

	/**
	 * adds a register
	 * parameters register for the register to be added
	 * @param register
	 */
	public void addRegister(Register register) {
		// TODO - implement Store.addRegister
		throw new UnsupportedOperationException();
	}

	/**
	 * adds a cashier
	 * parameters cashier for the cashier to be added
	 * @param cashier
	 */
	public void addCashier(Cashier cashier) {
		// TODO - implement Store.addCashier
		throw new UnsupportedOperationException();
	}

	/**
	 * removes cashier
	 * parameters cashier for the cashier to be removed
	 * @param cashier
	 */
	public void removeCashier(Cashier cashier) {
		// TODO - implement Store.removeCashier
		throw new UnsupportedOperationException();
	}

	/**
	 * adds a tax category
	 * parameters tax category for the tax category to be added
	 * @param taxCategory
	 */
	public void addTaxCategory(TaxCategory taxCategory) {
		// TODO - implement Store.addTaxCategory
		throw new UnsupportedOperationException();
	}

	/**
	 * removes a tax category
	 * parameters taxCategory for the category to be removed
	 * @param taxCategory
	 */
	public void removeTaxCategory(TaxCategory taxCategory) {
		// TODO - implement Store.removeTaxCategory
		throw new UnsupportedOperationException();
	}

	/**
	 * adds a session
	 * parameters session for the session to be added
	 * @param session
	 */
	public void addSession(Session session) {
		// TODO - implement Store.addSession
		throw new UnsupportedOperationException();
	}

	/**
	 * removes a session
	 * parameters session for the session to be removed
	 * @param session
	 */
	public void removeSession(Session session) {
		// TODO - implement Store.removeSession
		throw new UnsupportedOperationException();
	}

	/**
	 * finds a register given the register number
	 * parameters number for the register number
	 * returns register
	 * @param number
	 */
	public Register findRegisterByNumber(String number) {
		// TODO - implement Store.findRegisterByNumber
		throw new UnsupportedOperationException();
	}

	/**
	 * finds item for a give number
	 * parameters number for the number of the item
	 * returns Item,
	 * @param number
	 */
	public Item findItemForNumber(String number) {
		// TODO - implement Store.findItemForNumber
		throw new UnsupportedOperationException();
	}

	/**
	 * finds the tax category by the name
	 * parameters category for the category
	 * returns TaxCategory
	 * @param category
	 */
	public TaxCategory findTaxCategoryByName(String category) {
		// TODO - implement Store.findTaxCategoryByName
		throw new UnsupportedOperationException();
	}

	public String toString() {
		// TODO - implement Store.toString
		throw new UnsupportedOperationException();
	}

}