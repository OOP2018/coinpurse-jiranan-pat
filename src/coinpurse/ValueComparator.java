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
		if (a.getCurrency().compareToIgnoreCase(b.getCurrency()) == 0) {
			if (a.getValue() < b.getValue())
				return -1;
			else if (a.getValue() > b.getValue())
				return 1;
			return 0;
		}
		return a.getCurrency().compareTo(b.getCurrency());
	}

}
