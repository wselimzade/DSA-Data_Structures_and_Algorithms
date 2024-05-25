/**
 * @param {number[]} nums
 * @return {number}
 */

var singleNumber = function(nums) 
{   
    const numbers = new Set(nums)

    let sumComplete = 0
    for (const n of numbers)
        sumComplete += n * 2

    let sumCurrent = 0
    for (const n of nums)
        sumCurrent += n

    return sumComplete - sumCurrent
};