package arraysPractice;

public class ExerciseBestTimeToBuyAndSellStocks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] prices = {7, 1, 5, 3, 6, 4};
		
		System.out.println(Math.abs(maxProfit(prices)));
		System.out.println(maxProfitAnotherApproach(prices));
	}
	
	public static int maxProfit(int[] prices) {
        // TODO
		int returns = 0;
		int maxProfit = 0;
		for(int i=0;i<prices.length-1;i++) {
			for(int j=i+1;j<prices.length;j++) {
				
				returns = prices[i]-prices[j];
				if(returns<maxProfit) {
					maxProfit = returns;
					System.out.println("profit for "+ prices[i] + " and " + prices[j] + " = " +maxProfit);
				}
			}
		}
		return maxProfit;
    }
	
	public static int maxProfitAnotherApproach(int[] prices) {
        // TODO
		int minPrice = Integer.MAX_VALUE;
		int maxProfit = 0;
		
		for(int price : prices) {
			if(price<minPrice) {
				minPrice = price;
			}else if(price-minPrice > maxProfit) {
				maxProfit = price-minPrice;
			}
		}
		return maxProfit;
    }

}
