package posPD;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.*;

/**
 * Price class to handle item prices.
 */
public class Price {

	private BigDecimal price;
	private LocalDate effectiveDate;
	private ArrayList<Item> item;
	private String description;
	//private Long number;

	public BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public LocalDate getEffectiveDate() {
		return this.effectiveDate;
	}
	public void setEffectiveDate(LocalDate effectivedate) {
		this.effectiveDate = effectivedate;
	}

	public Price() {
		// TODO - implement Price.Price
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param price
	 * @param effectiveDate
	 */
	public Price(BigDecimal price, String description, LocalDate effectiveDate) {
		// TODO - implement Price.Price
		setPrice(price);
		setDescription(description);
		setEffectiveDate(effectiveDate);
		//throw new UnsupportedOperationException();
	}
	
	
	/**
	 * 
	 * @param date
	 */
	public boolean isEffective(LocalDate date) {
		// TODO - implement Price.isEffective
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param quantity
	 */
	public BigDecimal calcAmountForQty(int quantity) {
		// TODO - implement Price.calcAmountForQty
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param price
	 */
	public int compareTo(Price price) {
		// TODO - implement Price.compareTo
		throw new UnsupportedOperationException();
	}

	public String toString() {
		// TODO - implement Price.toString
		return this.getPrice() + " ";
		//throw new UnsupportedOperationException();
	}

}