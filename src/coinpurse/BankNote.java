package coinpurse;

/**
 * A bank note with value and currency.
 * 
 * @author Jiranan Patrathamakul
 */

public class BankNote implements Valuable {
	private long serial;
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
		this.serial = nextSerialNumber;
		nextSerialNumber++;
		
	}
	/**
	 * Get the serial number of the bank note.
	 * @return serial number of the bank note.
	 */
	public long getSerial() {
		return this.serial;
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
		BankNote other = (BankNote) obj;
		if ((this.currency.equalsIgnoreCase(other.getCurrency())) && 
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
		return this.value + "-" + this.currency + " note" + " ["+ this.serial+"]";
	}
}
