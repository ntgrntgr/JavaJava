package posPD;

import java.util.*;

/**
 * This class represents Item as items in the store.
 */
public class Item {

	private String number;
	private String description;
	private SaleLineItem saleLineItems;
	private Collection<UPC> uPCs;
	private Price prices;
	private TaxCategory taxCategory;
	private Price prices2;

	public String getNumber() {
		return this.number;
	}

	public void setNumber(String number) {
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
	 * params number for number , description for the description
	 * @param number
	 * @param description
	 */
	public Item(String number, String description) {
		// TODO - implement Item.Item
		throw new UnsupportedOperationException();
	}

	/**
	 * adds a price
	 * params price for the price
	 * @param price
	 */
	public void addPrice(Price price) {
		// TODO - implement Item.addPrice
		throw new UnsupportedOperationException();
	}

	/**
	 * removes a price
	 * params price for the price to be removed
	 * @param price
	 */
	public void removePrice(Price price) {
		// TODO - implement Item.removePrice
		throw new UnsupportedOperationException();
	}

}