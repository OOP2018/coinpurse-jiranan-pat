package coinpurse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

/**
 * Money Utility which contains filter and sort.
 *   
 * @author Jiranan Patrathamakul
 *
 */

public class MoneyUtil {
	
	/**
	 * filterByCurrency is to filter the money if it's the same currency or not.
	 * 
	 * @param money is list of money in the purse.
	 * @param currency is the currency that was given.
	 * @return list of money with same currency.
	 */
	
	public static List<Valuable> filterByCurrency (List<Valuable>  money, String currency) {
		List<Valuable> val = new ArrayList<Valuable>();
		for (Valuable moneyList: money) {
			if (moneyList.getCurrency().equals(currency)) 
				val.add(moneyList);
		}
		return val;
	}
	
	/**
	 * sortCoins is to sort the coins by its value from max to min.
	 * @param money list of money in the purse.
	 */
	
	public static void sortCoins (List<Valuable> money) {
		Collections.sort(money, new Comparator<Valuable>() {
			@Override
			public int compare(Valuable a, Valuable b) {
				return (int) Math.signum(a.getValue() - b.getValue());
			}
		});
	}
}
