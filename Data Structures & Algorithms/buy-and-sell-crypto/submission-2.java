class Solution {
    public int maxProfit(int[] prices) {
        int left = 0;
        int right = 1;
        int profit = 0;
        
        while(left < prices.length - 1 && right < prices.length) {
            profit = Math.max(profit, prices[right] - prices[left]);

            if(prices[right] < prices[left]) left = right;
            
            right++;
        }
        
        return profit;
    }
}
