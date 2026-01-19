package LC121_BestTimetoBuyandSellStock;

class Solution {
    public int maxProfit(int[] prices) {

        int buy = prices[0];
        int profit = 0;
        for(int i = 1; i < prices.length; i++) {
            if (prices[i] < buy) {
                buy = prices[i];
            } else if (prices[i] - buy > profit) {
                profit = prices[i] - buy;
            }


            //if (lastIndex <= i ) continue;
            //int diff = prices[lastIndex--] - prices[i];
            //if(diff > result) {
            //        result = diff;
            //}
        }

        return profit;
    }
}