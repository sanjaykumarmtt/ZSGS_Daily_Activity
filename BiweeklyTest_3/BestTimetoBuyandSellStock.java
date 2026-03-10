package BiweeklyTest_3;

public class BestTimetoBuyandSellStock {

	public static void main(String[] args) {
		
		int  prices[] = {7,1,5,3,6,4},
				prices1[] = {7,6,4,3,1};
		
		System.out.println(maxProfit(prices));
		System.out.println(maxProfit(prices1));
	}
	public static int maxProfit(int[] prices) {	
		int totalProfit=0,
			stock=prices[0];
		for(int day:prices) {
			
			if(stock>day) {
				stock=day;
			}else {
				int sellStock=day-stock;
				totalProfit=Math.max(totalProfit, sellStock);
			}
		}
		return totalProfit;
	}
}
