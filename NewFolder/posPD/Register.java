package posPD;

/**
 * This is a register for the store
 */
public class Register {

	private Long number;
	private boolean isUsed;
	private String registerNumber;
	
	private CashDrawer cashDrawer;
	
	public void setUsed(boolean isused) {
		this.isUsed = isused;
	}
	public boolean getIsUsed() {
		return isUsed;
	}

	public Long getNumber() {
		return this.number;
	}

	public void setNumber(Long number) {
		this.number = number;
	}

	public Register() {
		// TODO - implement Register.Register
		throw new UnsupportedOperationException();
	}
	/**
	 * This takes a cash Drawer as an input and assigns it to this register
	 * @param Cash Drawer
	 */
	public Register(CashDrawer cashDrawer, Long number) {
		this(number);
		this.cashDrawer = cashDrawer;
		this.registerNumber = number.toString();
		
	}

	/**
	 * sets the register number
	 * parameters register for the register number
	 * @param number
	 */
	public Register(Long number) {
		// TODO - implement Register.Register
		setNumber(number);
		//throw new UnsupportedOperationException();
	}
	
	/**
	 * This should return the cashDrawer on this register
	 */
	public CashDrawer getCashDrawer() {
		return this.cashDrawer;
	}

	public String toString() {
		// TODO - implement Register.toString
		return registerNumber;
		//throw new UnsupportedOperationException();
	}

}