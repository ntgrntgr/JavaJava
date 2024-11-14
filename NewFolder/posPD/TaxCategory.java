package posPD;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.*;

/**
 * This represent a tax category for items in the store
 */
public class TaxCategory {

	private String category;
	private TreeMap<String,TaxRate> taxRate = new TreeMap<>();
	//private LocalDate effectiveDate;

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
	 *
	 */
	public TaxCategory(String category) {
		setCategory(category);
		// TODO - implement TaxCategory.TaxCategory
		//throw new UnsupportedOperationException();
	}

	/**
	 * gets the tax rate for the given date
	 * parameters localDate for the date
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
	public void addTaxRate(TaxRate taxrate) {
		// TODO - implement TaxCategory.addTaxRate
		
		this.taxRate.put(taxrate.getDescription(), taxrate);
		//throw new UnsupportedOperationException();
	}

	/**
	 * removes given taxRate
	 * params taxRate for the tax tax rate to be removed
	 * @param taxRate
	 */
	public void removeTaxRate(TaxRate taxRate) {
		// TODO - implement TaxCategory.removeTaxRate
		this.taxRate.remove(taxRate.getDescription());
		//throw new UnsupportedOperationException();
	}
	
	/**
	 * this is a toString method to represent how a taxCategory might be
	 * viewed by other classes
	 */
	public String toString() {
		// TODO - implement TaxCategory.toString
		//return this.getCategory() + " ";
		 
		return getCategory()+ " \n" +taxRate.values().toString();
		//throw new UnsupportedOperationException();
	}

}