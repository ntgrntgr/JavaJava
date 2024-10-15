package posPD;

import java.time.LocalDate;

/**
 * This class represent a credit card.
 * It inherits from the AuthorizedPayment Class
 */
public class Credit extends AuthorizedPayment {

	private String cardType;
	private String acctNumber;
	private LocalDate expireDate;

	public String getCardType() {
		return this.cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getAcctNumber() {
		return this.acctNumber;
	}

	public void setAcctNumber(String acctNumber) {
		this.acctNumber = acctNumber;
	}

	public Credit() {
		// TODO - implement Credit.Credit
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param amount
	 * @param cardType
	 * @param acctNumber
	 * @param expireDate
	 */
	public Credit(String amount, String cardType, String acctNumber, String expireDate) {
		// TODO - implement Credit.Credit
		throw new UnsupportedOperationException();
	}

	public boolean isAuthorized() {
		// TODO - implement Credit.isAuthorized
		throw new UnsupportedOperationException();
	}

	public String toString() {
		// TODO - implement Credit.toString
		throw new UnsupportedOperationException();
	}

}