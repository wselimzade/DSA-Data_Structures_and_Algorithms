/**
 * @param {number[]} nums
 * @return {number}
 */

var singleNumber = function(nums) 
{   
    for (const num of nums)
    {
        if (nums.filter(n => n === num).length === 1)
            return num
    }

    return -1
};