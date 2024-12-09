package posPD;

import java.math.BigDecimal;

/**
 * This class represent a sale Line Item.
 * For Items that are on sale.
 */
public class SaleLineItem {

	private Item item;
	private int quantity;
	private Sale sale;

	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public SaleLineItem() {
		// TODO - implement SaleLineItem.saleLineItem
		//throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param sale
	 * @param item
	 * @param quantitee
	 */
	public SaleLineItem( Item item, int quantitee) {
		// TODO - implement SaleLineItem.saleLineItem
		this.item = item;
		this.quantity = quantitee;
		//throw new UnsupportedOperationException();
	}

	public BigDecimal calcSubTotal() {
		// TODO - implement SaleLineItem.calcSubTotal
		//throw new UnsupportedOperationException();
		return this.item.getPrice("Standard").getPrice().multiply(new BigDecimal(this.getQuantity()));
	}

	public BigDecimal calcTax() {
		// TODO - implement SaleLineItem.calcTax
		//throw new UnsupportedOperationException();
		return this.item.getTaxCategory().getTaxRate("Standard").getTaxRate();
	}

	public String toString() {
		// TODO - implement SaleLineItem.toString
		throw new UnsupportedOperationException();
	}

}