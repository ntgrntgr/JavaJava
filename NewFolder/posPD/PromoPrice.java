package posPD;

import java.time.LocalDate;

/**
 * This is promo price. inherits from Price class
 */
public class PromoPrice extends Price {

	private LocalDate endDate;

	public PromoPrice() {
		// TODO - implement PromoPrice.PromoPrice
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param price
	 * @param effectiveDate
	 * @param endDate
	 */
	public PromoPrice(String price, String effectiveDate, String endDate) {
		// TODO - implement PromoPrice.PromoPrice
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param date
	 */
	public boolean isEffective(LocalDate date) {
		// TODO - implement PromoPrice.isEffective
		throw new UnsupportedOperationException();
	}

	public String toString() {
		// TODO - implement PromoPrice.toString
		throw new UnsupportedOperationException();
	}

}