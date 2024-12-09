package posPD;

import java.math.BigDecimal;

/**
 * This class represents cash drawer responsible for adding and removing cash from the register
 */
public class CashDrawer {

	private BigDecimal cashAmount;
	private boolean isOpen;

	public BigDecimal getCashAmount() {
		return this.cashAmount;
	}

	public void setCashAmount(BigDecimal cashAmount) {
		this.cashAmount = cashAmount;
	}

	public boolean isIsOpen() {
		return this.isOpen;
	}

	public void setIsOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}

	public CashDrawer() {
		// TODO - implement CashDrawer.CashDrawer
		throw new UnsupportedOperationException();
	}
	/**
	 * Another constructor that creates a cash Drawer with a starting money
	 * @param Cash Amount
	 */
	public CashDrawer(String cashAmount) {
		this.cashAmount = new BigDecimal(cashAmount);
	}

	/**
	 * removes cash in the drawer
	 * params cash for the cash to be removed
	 * @param cash
	 */
	public void removeCash(String cash) {
		// TODO - implement CashDrawer.removeCash
		//throw new UnsupportedOperationException();
		this.cashAmount.subtract(new BigDecimal(cash));
	}

	/**
	 * adds cash to the drawer
	 * params cash for the cash to be added
	 * @param cash
	 */
	public void addCash(String cash) {
		// TODO - implement CashDrawer.addCash
		//throw new UnsupportedOperationException();
		this.cashAmount.add(new BigDecimal(cash));
	}

	public String toString() {
		// TODO - implement CashDrawer.toString
		throw new UnsupportedOperationException();
	}

}