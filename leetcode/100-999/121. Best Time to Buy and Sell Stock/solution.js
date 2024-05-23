/**
 * @param {number[]} prices
 * @return {number}
 */

var maxProfit = function(prices) 
{
    let profit = 0
    let minimum = prices[0]

    for (let i = 0; i < prices.length; ++i)
    {
        const curr = prices[i]

        minimum = Math.min(curr, minimum)
        profit = Math.max(curr - minimum, profit)
    }

    return profit
};