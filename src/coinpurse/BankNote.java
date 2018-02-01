package coinpurse;

/**
 * A bank note with value and currency.
 * 
 * @author Jiranan Patrathamakul
 */

public class BankNote implements Valuable {
	private long serialNumber;
	private double value;
	private String currency;
	private static long nextSerialNumber = 1000000;
	
	/**
	 * A bank note with given value and currency.
	 * 
	 * @param value of the bank note.
	 * @param currency of the bank note.
	 */
	public BankNote (double value, String currency) {
		this.value = value;
		this.currency = currency;
		this.serialNumber = nextSerialNumber;
		nextSerialNumber++;
		
	}
	/**
	 * Get the serial number of the bank note.
	 * @return serial number of the bank note.
	 */
	public long getSerialNumber() {
		return this.serialNumber;
	}
	
	/**
	 * Get the value of the bank note.
	 * @return value of the bank note.
	 */
	public double getValue(){
		return this.value;
	}
	
	/**
	 * Get the currency of the bank note.
	 * @return currency of the bank note.
	 */
	public String getCurrency() {
		return this.currency;
	}
	
	/**
	 * To check the coin if it equals to value and currency or not.
	 * @param obj is an object that we use to check. 
	 * @return an object that we're using to check.  
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj == null) 
			return false;
		if (obj.getClass() != this.getClass())
			return false;
		Coin other = (Coin) obj;
		if ((this.currency  == other.getCurrency()) && 
				(this.value == other.getValue()))
			return true;
		return false;
	}
	/**
	 * toString is to describes the bank note.
     * @return description of the bank note. 
	 */
	@Override
	public String toString() {
		return this.value + "-" + this.currency + " note" + " ["+ this.serialNumber+"]";
	}
}
