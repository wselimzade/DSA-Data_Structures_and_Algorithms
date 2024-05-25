/**
 * @param {number[]} nums
 * @return {number}
 */

var singleNumber = function(nums) 
{   
    let number = 0

    for (const num of nums)
        number ^= num

    return number
};