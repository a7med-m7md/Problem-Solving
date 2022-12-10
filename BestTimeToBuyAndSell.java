class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int l = 0, r = 1;
        while(r < prices.length){
                if(prices[r] > prices[l]){
                    int profit = prices[r] - prices[l];
                    maxProfit = Math.max(profit, maxProfit);
                }
                else
                    l = r;
                r++;
            }
        return maxProfit;
    }
}