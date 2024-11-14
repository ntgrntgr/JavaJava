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
	
	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public void setEffectiveDate(LocalDate effectivedate) {
		this.effectiveDate = effectivedate;
	}

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
	public TaxRate(LocalDate effectiveDate, BigDecimal rate, String description) {
		// TODO - implement TaxRate.TaxRate
		setTaxRate(rate);
		setEffectiveDate(effectiveDate);
		setDescription(description);
		//throw new UnsupportedOperationException();
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
		return this.description + " " + effectiveDate +" " + taxRate;
		//throw new UnsupportedOperationException();
	}

}