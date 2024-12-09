package posPD;

import java.util.*;

/**
 * This class represents Item as items in the store.
 */
public class Item {

	private Long number = 0L;
	private String description;
	//private SaleLineItem saleLineItems;
	//private ArrayList<UPC> uPCs;
	private UPC uPC;
	
	private TaxCategory taxCategory;
	//private Price prices;
	private TreeMap<String,Price> prices = new TreeMap<>();
	
	public UPC getUPC() {
		return this.uPC;
	}
	public void setUPC(UPC upc) {
		this.uPC = upc;
	}

	public Long getNumber() {
		return this.number;
	}

	public void setNumber(Long number) {
		this.number = number;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Item() {
		// TODO - implement Item.Item
		throw new UnsupportedOperationException();
	}

	/**
	 * sets the number and description of the item
	 * parameter number for number , description for the description
	 * @param number
	 * @param description
	 */
	public Item(String description) {
		// TODO - implement Item.Item
		setDescription(description);
		//throw new UnsupportedOperationException();
	}

	/**
	 * adds a price
	 * parameter price for the price
	 * @param price
	 */
	public void addPrice(Price price, String description) {
		/**remember to come back here and add an effective date
		 * 
		 * 
		 */
		this.prices.put(description,new Price(price.getPrice(),description,price.getEffectiveDate()));
		
		//throw new UnsupportedOperationException();
	}

	/**
	 * removes a price
	 * parameter price for the price to be removed
	 * @param price
	 */
	public void removePrice(String description) {
		// TODO - implement Item.removePrice
		this.prices.remove(description);
		//throw new UnsupportedOperationException();
	}
	
	/**
	 * this should return a price that can be used for this item
	 * @return price
	 */
	public Price getPrice(String priceType) {
		return this.prices.get(priceType);
	}
	
	/**
	 * This is a getter for tax category
	 * should return this item's tax category
	 */
	public TaxCategory getTaxCategory() {
		return this.taxCategory;
	}
	
	/**
	 * This is a setter for tax category
	 * @param taxCategory
	 */
	public void setTaxCategory(TaxCategory taxcategory) {
		this.taxCategory = taxcategory;
	}
	
	
	
	public String toString() {
		// TODO - implement Item.removePrice
		return " " + this.getDescription() + " " + this.prices.get("Standard").toString() + "'" + this.getTaxCategory().toString() +"'" ;
				//throw new UnsupportedOperationException();
	}

}