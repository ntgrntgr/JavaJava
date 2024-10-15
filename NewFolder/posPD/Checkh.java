package posPD;

/**
 * This class represents a payment option using a check.
 * It inherits from the AuthorizedPayment class
 */
public class Checkh extends AuthorizedPayment {

	private String routingNumber;
	private String accountNumber;
	private String checkNumber;

	public String getRoutingNumber() {
		return this.routingNumber;
	}

	public void setRoutingNumber(String routingNumber) {
		this.routingNumber = routingNumber;
	}

	public String getAccountNumber() {
		return this.accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getCheckNumber() {
		return this.checkNumber;
	}

	public void setCheckNumber(String checkNumber) {
		this.checkNumber = checkNumber;
	}
	
	
	/**
	 * 
	 * Default Constructor for this class 
	 */
	public Checkh() {
		// TODO - implement Checkh.Check
		// Default Constructor
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * Custom constructor for this class
	 * @param amount
	 * @param accountNumber
	 * @param checkNumber
	 */
	public Checkh(String amount, String accountNumber, String checkNumber) {
		// TODO - implement Checkh.Check
		throw new UnsupportedOperationException();
	}

	public boolean isAuthorized() {
		// TODO - implement Checkh.isAuthorized
		throw new UnsupportedOperationException();
	}

	public String toString() {
		// TODO - implement Checkh.toString
		throw new UnsupportedOperationException();
	}

}