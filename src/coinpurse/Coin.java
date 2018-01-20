package coinpurse;

/**
 * A coin with value and currency.
 * 
 * @author Jiranan Patrathamakul
 */

public class Coin implements Comparable<Coin> {
	private double value;
	private String currency;
	
	
	/**
	 * A coin with given value and currency.
	 * 
	 * @param value of the coin.
	 * @param currency of the coin.
	 */
	
	public Coin (double value, String currency) {
		this.currency = currency;
		this.value = value;

	}
	
	/**
	 * Return a value of the coins.
	 * 
	 * @return value of the coins.
	 */
	
	public double getValue() {
		return value;
	}
	
	/**
	 * Return a currency of the coins.
	 * @return currency of the coins.
	 */
	
	public String getCurrency() {
		return currency;
	}
	
	/**
	 * To check the coin if it equals to value and currency or not.
	 */
	
	public boolean equals (Object arg) {
		if (arg == null) 
			return false;
		if (arg.getClass() != this.getClass())
			return false;
		Coin other = (Coin) arg;
		if (this.currency.equalsIgnoreCase(other.getCurrency()) && 
				this.value == other.getValue())
			return true;
		return false;
	}
	
	/**
	 * Compare the values of two coins.
	 */
	
	@Override
	public int compareTo(Coin o) {
		if (o == null)
			return -1;
		if (this.value < o.getValue())
			return -1;
		if (this.value > o.getValue())
			return 1;
		if (this.value == o.getValue())
			return 0;
		return -1;
	}
	
	/**
	 * toString is to describes what's in the purse.
     * @return description of what's in the purse. 
	 */
	
	@Override
	public String toString() {
		return value + "-" + currency;
	}
	
}
