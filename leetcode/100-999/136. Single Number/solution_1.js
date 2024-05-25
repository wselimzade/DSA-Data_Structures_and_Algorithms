/**
 * @param {number[]} nums
 * @return {number}
 */

var singleNumber = function(nums) 
{
    nums.sort()
    
    for (let i = 0; i < nums.length; i += 2)
    {
        if (i == nums.length - 1)
            return nums[i]

        if (nums[i] != nums[i + 1])
            return nums[i]
    }

    return -1
};