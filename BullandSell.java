package strarr;
/*Say you have an array for which the ith element is the price of a given stock on day i.

If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.

Example 1:

Input: [7, 1, 5, 3, 6, 4]
Output: 5

max. difference = 6-1 = 5 (not 7-1 = 6, as selling price needs to be larger than buying price)

Example 2:

Input: [7, 6, 4, 3, 1]
Output: 0

In this case, no transaction is done, i.e. max profit = 0.

*idea:set an int min to be the cureen smallest stock index.using for loop check each price in the array
*if it smaller than the min(current smallest price)update min, else find the profit, the profit will be
*either the current smallest profit or the new higher price - the smallest price.
 * 
 */
public class BullandSell {
	public static int maxprofit(int[]stocks){
		int profit=0;
		int min=0;
		for (int i=1;i<stocks.length;i++){
			if(stocks[i]<stocks[min]) min=i;//min always be the smallest num in the array.
			else profit=Math.max(profit, stocks[i]-stocks[min]);//dp,profit is the current smallest profit,if find a stock la
			
		}
		return profit;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]stocks={7, 1, 5, 3, 6, 4};
 System.out.println(maxprofit(stocks));
	}

}
