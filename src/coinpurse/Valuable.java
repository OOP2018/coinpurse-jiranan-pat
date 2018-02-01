package coinpurse;

/**
 * Valuable interface to get value and currency
 * 
 * @author Jiranan Patrathamkul
 *
 */

public interface Valuable {
	/**
	 * Get the value of the object with that currency.
	 * 
	 * @return the value of the object.
	 */
	public double getValue();
	
	/**
	 * Get the currency of the object with that value.
	 * 
	 * @return the currency of the object.
	 */
	public String getCurrency();

}
