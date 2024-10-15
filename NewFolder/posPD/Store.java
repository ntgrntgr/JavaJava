package posPD;

import java.util.*;

/**
 * This is the instance of the store it has all the info to know about a store
 */
public class Store {

	private String number;
	private String name;
	private Collection<Session> sessions;
	private TaxCategory taxCategories;
	private Collection<Item> items;
	private Collection<Cashier> cashiers;
	private Collection<Register> registers;
	private Collection<UPC> upcs;

	public String getNumber() {
		return this.number;
	}

	public void setNumber(String number) {
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
	 * params number of the store number , name for the store name
	 * @param numberr
	 * @param name
	 */
	public Store(String numberr, String name) {
		// TODO - implement Store.Store
		throw new UnsupportedOperationException();
	}

	/**
	 * finds the item for a give UPC
	 * params upc for the UPC to find an item for
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
	 * params number for the cashier number
	 * @param number
	 */
	public Cashier findCashierForNumber(String number) {
		// TODO - implement Store.findCashierForNumber
		throw new UnsupportedOperationException();
	}

	/**
	 * adds and item
	 * params item for an item to be added
	 * @param item
	 */
	public void add(Item item) {
		// TODO - implement Store.add
		throw new UnsupportedOperationException();
	}

	/**
	 * adds a upc
	 * params upc for the UPC to be added
	 * @param upc
	 */
	public void addUPC(UPC upc) {
		// TODO - implement Store.addUPC
		throw new UnsupportedOperationException();
	}

	/**
	 * adds a register
	 * params register for the register to be added
	 * @param register
	 */
	public void addRegister(Register register) {
		// TODO - implement Store.addRegister
		throw new UnsupportedOperationException();
	}

	/**
	 * adds a cashier
	 * params cashier for the cashier to be added
	 * @param cashier
	 */
	public void addCashier(Cashier cashier) {
		// TODO - implement Store.addCashier
		throw new UnsupportedOperationException();
	}

	/**
	 * removes cashier
	 * params cashier for the cashier to be removed
	 * @param cashier
	 */
	public void removeCashier(Cashier cashier) {
		// TODO - implement Store.removeCashier
		throw new UnsupportedOperationException();
	}

	/**
	 * adds a tax category
	 * params tax category for the tax category to be added
	 * @param taxCategory
	 */
	public void addTaxCategory(TaxCategory taxCategory) {
		// TODO - implement Store.addTaxCategory
		throw new UnsupportedOperationException();
	}

	/**
	 * removes a tax category
	 * params taxCategory for the category to be removed
	 * @param taxCategory
	 */
	public void removeTaxCategory(TaxCategory taxCategory) {
		// TODO - implement Store.removeTaxCategory
		throw new UnsupportedOperationException();
	}

	/**
	 * adds a session
	 * params session for the session to be added
	 * @param session
	 */
	public void addSession(Session session) {
		// TODO - implement Store.addSession
		throw new UnsupportedOperationException();
	}

	/**
	 * removes a session
	 * params session for the session to be removed
	 * @param session
	 */
	public void removeSession(Session session) {
		// TODO - implement Store.removeSession
		throw new UnsupportedOperationException();
	}

	/**
	 * finds a register given the register number
	 * paramms number for the register number
	 * returns register
	 * @param number
	 */
	public Register findRegisterByNumber(String number) {
		// TODO - implement Store.findRegisterByNumber
		throw new UnsupportedOperationException();
	}

	/**
	 * finds item for a give number
	 * params number for the number of the item
	 * returns Ite,
	 * @param number
	 */
	public Item findItemForNumber(String number) {
		// TODO - implement Store.findItemForNumber
		throw new UnsupportedOperationException();
	}

	/**
	 * finds the tax category by the name
	 * params category for the category
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