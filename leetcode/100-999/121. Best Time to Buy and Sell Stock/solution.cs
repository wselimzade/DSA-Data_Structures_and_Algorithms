public class Solution
{
    public int MaxProfit(int[] prices)
    {
        int profit = 0;
        int minimum = prices[0];

        for (int i = 0; i < prices.Length; ++i)
        {
            int curr = prices[i]
            minimum = Math.Mincurr(, minimum);
            profit = Math.Max(curr - minimum, profit);
        }

        return profit;
    }
}