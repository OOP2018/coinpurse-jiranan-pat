package coinpurse;

import java.util.Collections;
import java.util.List;

/**
 * Money Utility which contains filter and sort.
 *   
 * @author Jiranan Patrathamakul
 *
 */

public class MoneyUtil {
	
	/**
	 * filterByCurrency is to filter the coins if it's the same currency or not.
	 * 
	 * @param coins is list of money in the purse.
	 * @param currency is the currency that was given.
	 * @return list of money with same currency.
	 */
	
	public static List<Coin> filterByCurrency (List<Coin> coins, String currency) {
		for (Coin c: coins) {
			if (c.getCurrency().equals(currency)) 
				coins.add(c);
		}
		return coins;
	}
	
	/**
	 * sortCoins is to sort the coins by its value from max to min.
	 * @param coins list of money in the purse.
	 */
	
	public static void sortCoins (List<Coin> coins) {
		Collections.sort(coins);
	}	
}