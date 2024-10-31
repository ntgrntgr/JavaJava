package posPD;

/**
 * This is a register for the store
 */
public class Register {

	private Long number;
	private boolean isUsed;
	
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
	 * sets the register number
	 * parameters register for the register number
	 * @param number
	 */
	public Register(Long number) {
		// TODO - implement Register.Register
		setNumber(number);
		throw new UnsupportedOperationException();
	}

	public String toString() {
		// TODO - implement Register.toString
		throw new UnsupportedOperationException();
	}

}