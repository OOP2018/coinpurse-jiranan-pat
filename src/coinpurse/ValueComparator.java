package coinpurse;

import java.util.Comparator;

/**
 * Comparator class of object using that currency.
 * 
 * @author Jiranan Patrathamakul
 *
 */

public class ValueComparator implements Comparator<Valuable> {
	/**
	 * Compare the currency of two objects.
	 * 
	 * @param a is the first object.
	 * @param b is the second object.
	 * 
	 * @return -1 if the currency of a is come before the other.
	 * 0 if currency of the both objects are the same.
	 * 1 if currency of the a is come after the other.
	 */
	public int compare(Valuable a, Valuable b) {
		return a.getCurrency().compareTo(b.getCurrency());
	}

}
