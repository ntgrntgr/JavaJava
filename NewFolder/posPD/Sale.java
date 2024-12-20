package posPD;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.*;

/**
 * This class represent a Sale.
 * It knows about Payment class and
 * SaleLineItem class
 */
public class Sale {

	private ArrayList<Payment> payments;
	private ArrayList<SaleLineItem> saleLineItems;
	private LocalDateTime dateTime;
	private boolean taxFree;

	public Sale() {
		// TODO - implement Sale.Sale
		//throw new UnsupportedOperationException();
		payments= new ArrayList<Payment>();
		 saleLineItems= new ArrayList<SaleLineItem>();
		 dateTime=LocalDateTime.now();
		
	}

	/**
	 * 
	 * params taxFree
	 * @param taxFree
	 */
	public Sale(String taxFree) {
		// TODO - implement Sale.Sale
		//throw new UnsupportedOperationException();
	}

	/**
	 * adds payment
	 * params payment for the payment to be added
	 * @param payment
	 */
	public void addPayment(Payment payment) {
		// TODO - implement Sale.addPayment
		throw new UnsupportedOperationException();
	}

	/**
	 * removes payment
	 * params payment for the payment to be removed
	 * @param payment
	 */
	public void removePayment(Payment payment) {
		// TODO - implement Sale.removePayment
		throw new UnsupportedOperationException();
	}

	/**
	 * adds a sale line item
	 * params sli for the sale line item to be added
	 * @param sli
	 */
	public void addSaleLineItem(SaleLineItem saleLineItem) {
		// TODO - implement Sale.addSaleLineItem
		//throw new UnsupportedOperationException();
		saleLineItems.add(saleLineItem);
	}

	/**
	 * removes sale line item
	 * params sli for the sale line item to be removed
	 * @param sli
	 */
	public void removeSaleLineItem(SaleLineItem sli) {
		// TODO - implement Sale.removeSaleLineItem
		throw new UnsupportedOperationException();
	}

	/**
	 * calculates the total sales
	 * returns BigDecimal
	 */
	public BigDecimal calcTotal() {
		// TODO - implement Sale.calcTotal
		//throw new UnsupportedOperationException();
		return this.calcSubTotal().add(this.calcTax());
		
	}

	/**
	 * calculates the sub total
	 * returns BigDecimal
	 */
	public BigDecimal calcSubTotal() {
		// TODO - implement Sale.calcSubTotal
		BigDecimal total =  BigDecimal.ZERO;
		for(SaleLineItem item: saleLineItems) {
			total  = total.add(item.calcSubTotal());
		}
		return total;
		//throw new UnsupportedOperationException();
	}

	/**
	 * calculates tax
	 * returns BigDecimal
	 */
	public BigDecimal calcTax() {
		// TODO - implement Sale.calcTax
		//throw new UnsupportedOperationException();
		BigDecimal total =  BigDecimal.ZERO;
		for(SaleLineItem item: saleLineItems) {
			total  = total.add(item.calcTax());
		}
		return total;
	}

	/**
	 * gets total payments
	 * returns BigDecimal
	 */
	public BigDecimal getTotalPayments() {
		// TODO - implement Sale.getTotalPayments
		throw new UnsupportedOperationException();
	}

	/**
	 * checks if payment is enough
	 * returns boolean
	 */
	public boolean isPaymentEnough() {
		// TODO - implement Sale.isPaymentEnough
		throw new UnsupportedOperationException();
	}

	/**
	 * calculates amount for payment
	 * params amtTendered for the amount tendered
	 * @param amtTendered
	 */
	public void calcAmountForPayment(BigDecimal amtTendered) {
		// TODO - implement Sale.calcAmountForPayment
		throw new UnsupportedOperationException();
	}

	/**
	 * calculates change
	 * returns big decimal
	 */
	public BigDecimal calcChange() {
		// TODO - implement Sale.calcChange
		throw new UnsupportedOperationException();
	}

	/**
	 * calculates amount tendered
	 * returns BigDecimal
	 */
	public BigDecimal calcAmtTendered() {
		// TODO - implement Sale.calcAmtTendered
		throw new UnsupportedOperationException();
	}

	public String toString() {
		// TODO - implement Sale.toString
		throw new UnsupportedOperationException();
	}

}