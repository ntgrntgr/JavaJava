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
	private Collection<Sale> sales;
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
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param sale
	 */
	public void addSale(Sale sale) {
		// TODO - implement Session.addSale
		throw new UnsupportedOperationException();
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
	 * 
	 * @param cashhh
	 */
	public BigDecimal calcCashCounterDiff(int cashhh) {
		// TODO - implement Session.calcCashCounterDiff
		throw new UnsupportedOperationException();
	}

	public BigDecimal calcTotal() {
		// TODO - implement Session.calcTotal
		throw new UnsupportedOperationException();
	}

	public String toString() {
		// TODO - implement Session.toString
		throw new UnsupportedOperationException();
	}

}