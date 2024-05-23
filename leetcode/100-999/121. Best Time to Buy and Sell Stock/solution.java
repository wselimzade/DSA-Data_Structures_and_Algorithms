class Solution 
{
    public int maxProfit(int[] prices) 
    {
        int profit = 0;
        int minimum = prices[0];
        
        for (int i = 0; i < prices.length; ++i)
        {
            int curr = prices[i];
            minimum = Math.min(curr, minimum);
            profit = Math.max(curr - minimum, profit);
        }

        return profit;
    }
}