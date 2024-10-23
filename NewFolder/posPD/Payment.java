package posPD;

import java.math.BigDecimal;

/**
 * This class represents the Payment.
 */
public class Payment {

	private BigDecimal amount;
	private BigDecimal amtTendered;
	
	public Payment() {
		
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public void setAmountTendered(BigDecimal amtTendered) {
		this.amtTendered = amtTendered;
	}

	public boolean countsAsCash() {
		// TODO - implement Payment.countsAsCash
		throw new UnsupportedOperationException();
	}
	public String toString() {
		throw new UnsupportedOperationException();
		
	}

}