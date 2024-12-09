package posPD;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.*;

/**
 * This class represents a session in the store
 */
public class Session {

	private Cashier cashier;
	private Register register;
	private ArrayList<Sale> sales;
	private LocalDateTime startDateTime;
	private LocalDateTime endDateTime;
	

	public Session() {
		// TODO - implement Session.Session
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param cashier
	 * @param register
	 */
	public Session(Cashier cashier, Register register) {
		// TODO - implement Session.Session
		//throw new UnsupportedOperationException();
		this.sales = new ArrayList<Sale>();
		this.setCashier(cashier);
		this.setRegister(register);
		
	}

	/**
	 * 
	 * @param sale
	 */
	public void addSale(Sale sale) {
		// TODO - implement Session.addSale
		//throw new UnsupportedOperationException();
		this.sales.add(sale);
	}

	/**
	 * 
	 * @param sale
	 */
	public void removeSale(Sale sale) {
		// TODO - implement Session.removeSale
		throw new UnsupportedOperationException();
	}
	
	/**
	 * this is a setter for cashier in this session
	 * @param cashier
	 */
	public void setCashier(Cashier cashier) {
		this.cashier = cashier;
	}
	
	/**
	 * this is a getter for the cashier in this session
	 * @return Cashier
	 */
	public Cashier getCashier() {
		return this.cashier;
	}
	
	/**
	 * This is a setter for the register that will be used in this session
	 * @param register
	 */
	public void setRegister(Register register) {
		this.register = register;
	}
	
	/**
	 * This is a getter for the register being used in this session
	 * @return Register
	 */
	public Register getRegister() {
		return this.register;
	}

	/**
	 * 
	 * @param cashhh
	 */
	public BigDecimal calcCashCounterDiff(int cashhh) {
		// TODO - implement Session.calcCashCounterDiff
		throw new UnsupportedOperationException();
	}

	public BigDecimal calcTotal() {
		// TODO - implement Session.calcTotal
		//throw new UnsupportedOperationException();
		return calcSubTotal().add(calcTaxTotal());
	}
	
	/**
	 * should return the sub total of the whole session
	 * @return
	 */
	public BigDecimal calcSubTotal() {
		BigDecimal subTotal = BigDecimal.ZERO;
		for(Sale sale: sales) {
			subTotal = subTotal.add(sale.calcSubTotal());
		}
		return subTotal;
	}
	
	public BigDecimal calcTaxTotal() {
		BigDecimal subTax = BigDecimal.ZERO;
		for(Sale sale: sales) {
			subTax = subTax.add(sale.calcTax());
		}
		return subTax;
	}

	public String toString() {
		// TODO - implement Session.toString
		//throw new UnsupportedOperationException();
	return "Session: \n Cashier " + getCashier().getName() + "\n "  
			+ " register: " +getRegister().getNumber() + "\n"
			+ "Sales: \n Subtotal" + calcSubTotal() + "\n"  
			+ " tax: " + calcTaxTotal() + "\n"
			+ "Total: " + calcTotal();
	}

}