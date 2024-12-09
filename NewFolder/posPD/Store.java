package posPD;

import java.util.*;

/**
 * This is the instance of the store it has all the info to know about a store
 */
public class Store {

	private Long storeNumber;
	private String name;
	private HashSet<Session> sessions = new HashSet<>();
	private HashSet<TaxCategory> taxCategories = new HashSet<>();
	private TreeMap<Long,Item> items = new TreeMap<>();
	private TreeMap<Long,Cashier> cashiers = new TreeMap<>();
	private TreeMap<Long,Register> registers = new TreeMap<>();
	private HashSet<UPC> upcs = new HashSet<>();
	private HashSet<Long> cashierIDs = new HashSet<>();
	private Long registersCount;
	private Long cashiersCount;
	private Long itemCount;
	private Long upcsCount;
	
	/**
	 * @return upcsCount
	 */
	public Long getUpcsCount() {
		return this.upcsCount;
	}
	
	/**
	 * sets upcs count
	 */
	public void setUpcsCount(Long upc) {
		this.upcsCount = upc;
	}
	
	public void incrementUpcCount() {
		this.upcsCount++;
	}
	
	public void resetUPCsCount() {
		this.upcsCount = 1L;
	}
	
	

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
	public void incrementCashierCount() {
		this.cashiersCount++;
	}
	public void decrementCashierCount() {
		this.cashiersCount--;
	}
	public void incrementRegisterCount() {
		this.registersCount++;
	}
	public void decrementRegisterCount() {
		this.registersCount--;
	}

	public Long getNumber() {
		return this.storeNumber;
	}

	public void setNumber(Long number) {
		this.storeNumber = number;
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
	public Store(String name) {
		// TODO - implement Store.Store
		this.name = name;
		this.setRegistersCount(1L);
		this.setCashiersCount(1L);
		this.resetItemCount();
		this.resetUPCsCount();
		//throw new UnsupportedOperationException();
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
	 * this creates a new item, I want to put this method inside here to ensure this 
	 * no UPC will be created without the store recording it. 
	 */
	public void createItem(String description) {
		Item templateItem = new Item(description);
		UPC templateUPC = new UPC(this.getUpcsCount());
		templateItem.setUPC(templateUPC);
		addItem(templateItem);
	}

	/**
	 * adds and item
	 * parameters item for an item to be added
	 * @param item
	 */
	public void addItem(Item item) {
		// TODO - implement Store.add
		this.items.put(item.getUPC().getUPC(),item);
		addUPC(item.getUPC());
		incrementItemCount();
		//throw new UnsupportedOperationException();
		
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
		//throw new UnsupportedOperationException();
	}
	/**
	 * retrieves all items in the store
	 * takes no parameters
	 */
	public TreeMap<Long,Item> getItems(){
		System.out.println("Store has " + (getItemCount() -1) + " Items");
		return items;
	}

	/**
	 * adds a upc
	 * parameters upc for the UPC to be added
	 * @param upc
	 */
	public void addUPC(UPC upc) {
		// TODO - implement Store.addUPC
		this.upcs.add(upc);
		incrementUpcCount();
		//throw new UnsupportedOperationException();
		
		
	}

	/**
	 * adds a register
	 * parameters register for the register to be added
	 * @param register
	 */
	public void addRegister(Register register) {
		// TODO - implement Store.addRegister
		//throw new UnsupportedOperationException();
		this.registers.put(register.getNumber(), register);
		this.incrementRegisterCount();
		//System.out.println("Success");
	}
	
	/**
	 * this returns all available registers in the store
	 */
	public TreeMap<Long,Register> getRegisters(){
		System.out.println("Store has " + " " + (this.getRegistersCount() - 1) + " Registers" );
		return this.registers;
	}

	/**
	 * adds a cashier
	 * parameters cashier for the cashier to be added
	 * @param cashier
	 */
	public void addCashier(Cashier cashier) {
		// TODO - implement Store.addCashier
		//throw new UnsupportedOperationException();
		this.cashiers.put(cashier.getNumber(),cashier);
		incrementCashierCount();
		
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
	 * This should return all the cashiers present in this store
	 * takes no parameters
	 * @return cashiers
	 */
	public TreeMap<Long,Cashier> getCashiers(){
		
		System.out.println("Store has " + (getCashiersCount()-1) + " Cashiers");
		return this.cashiers;
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
	 * This method should create/start a session
	 * 
	 */
	public void startSession(Cashier cashier, Register register, Item item) {
		Session templateSession = new Session();
		
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
		//throw new UnsupportedOperationException();
		return items.toString();
	}

}