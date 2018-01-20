package coinpurse;

/**
 * 
 * @author Jiranan Patrathamakul
 *
 */

public class Coin implements Comparable<Coin> {
	private double value;
	private String currency;
	
	
	/**
	 * 
	 * 
	 * @param value
	 * @param currency
	 */
	
	public Coin (double value, String currency) {
		this.currency = currency;
		this.value = value;

	}
	public double getValue() {
		return value;
	}
	public String getCurrency() {
		return currency;
	}
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
	@Override
	public String toString() {
		return value + "-" + currency;
	}
	
}
