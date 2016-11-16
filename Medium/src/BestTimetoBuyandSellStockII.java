
public class BestTimetoBuyandSellStockII {
	public static int maxProfit(int [] prices){
		int min=0;
		int profit=0;
		//int maxprofit=0;
		for (int i =1;i<prices.length;i++){
			if(prices[i]>prices[i-1]){
				min=prices[i-1];
				profit += prices[i]-min;
				
				}
			
			//return profit;
			}
		return profit;
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] prices = {10,2,18,4,6,19,12};
		System.out.println(maxProfit(prices));
	}

}
