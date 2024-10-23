package posPD;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * this Class represents Tax Rate for the store
 */
public class TaxRate {

	private String description;
	private BigDecimal taxRate;
	private LocalDate effectiveDate;

	public BigDecimal getTaxRate() {
		return this.taxRate;
	}

	public void setTaxRate(BigDecimal taxRate) {
		this.taxRate = taxRate;
	}

	public TaxRate() {
		// TODO - implement TaxRate.TaxRate
		throw new UnsupportedOperationException();
	}

	/**
	 * sets the effective date and rate of tax
	 * params effectiveDate, rate
	 * @param effectiveDate
	 * @param rate
	 */
	public TaxRate(LocalDate effectiveDate, BigDecimal rate) {
		// TODO - implement TaxRate.TaxRate
		throw new UnsupportedOperationException();
	}

	/**
	 * checks if date is effective
	 * params date for the date to be checked
	 * returns boolean
	 * @param date
	 */
	public boolean isEffective(LocalDate date) {
		// TODO - implement TaxRate.isEffective
		throw new UnsupportedOperationException();
	}

	/**
	 * compares tax rates
	 * params taxRate for the tax rate to be compared
	 * returns int
	 * @param taxRate
	 */
	public int compareTo(TaxRate taxRate) {
		// TODO - implement TaxRate.compareTo
		throw new UnsupportedOperationException();
	}

	public String toString() {
		// TODO - implement TaxRate.toString
		throw new UnsupportedOperationException();
	}

}