package coinpurse;

import java.util.Collections;
import java.util.List;



public class MoneyUtil {
	
	public static List<Coin> filterByCurrency (List<Coin> coins, String currency) {
		for (Coin c: coins) {
			if (c.getCurrency() != currency) 
				coins.remove(c);
		}
		return coins;
	}
	
	public static void sortCoins (List<Coin> coins) {
		Collections.sort(coins);
		printCoins(coins);
	}
	
	public static void printCoins (List<Coin> coins) {
		for (Coin c: coins) {
			System.out.println(c);
		}	
	}
	
	
}