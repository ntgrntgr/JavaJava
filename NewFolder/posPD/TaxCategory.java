package posPD;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.*;

/**
 * This represent a tax category for items in the store
 */
public class TaxCategory {

	private String category;
	private Collection<TaxRate> taxRate;
	private Calendar effectiveDate;

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public TaxCategory() {
		// TODO - implement TaxCategory.TaxCategory
		throw new UnsupportedOperationException();
	}

	/**
	 * sets the category, effectiveDate and TaxRate
	 * params category,effectiveDate,taxRate
	 * @param category
	 * @param effectiveDate
	 * @param taxRate
	 */
	public TaxCategory(String category, String effectiveDate, String taxRate) {
		// TODO - implement TaxCategory.TaxCategory
		throw new UnsupportedOperationException();
	}

	/**
	 * gets the tax rate for the given date
	 * params localDate for the date
	 * returns the taxRate
	 * @param date
	 */
	public BigDecimal getTaxRateforDate(LocalDate date) {
		// TODO - implement TaxCategory.getTaxRateforDate
		throw new UnsupportedOperationException();
	}

	/**
	 * adds a given tax rate
	 * params taxRate for the tax rate to be added
	 * @param taxRate
	 */
	public void addTaxRate(TaxRate taxRate) {
		// TODO - implement TaxCategory.addTaxRate
		throw new UnsupportedOperationException();
	}

	/**
	 * removes given taxRate
	 * params taxRate for the tax tax rate to be removed
	 * @param taxRate
	 */
	public void removeTaxRate(TaxRate taxRate) {
		// TODO - implement TaxCategory.removeTaxRate
		throw new UnsupportedOperationException();
	}

}