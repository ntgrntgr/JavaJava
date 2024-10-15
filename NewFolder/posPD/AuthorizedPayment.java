package posPD;

/**
 * This class represents Authorized Payment methods
 * It inherits from Payment class
 */
public class AuthorizedPayment extends Payment {

	private String authorizationCode;

	/**
	 * This class represents authorized payment methods.
	 * It inherits from payment
	 */
	public boolean isAuthorized() {
		// TODO - implement AuthorizedPayment.isAuthorized
		throw new UnsupportedOperationException();
	}

	public boolean countsAsCash() {
		// TODO - implement AuthorizedPayment.countsAsCash
		throw new UnsupportedOperationException();
	}

}