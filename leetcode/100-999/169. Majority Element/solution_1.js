/**
 * @param {number[]} nums
 * @return {number}
 */

var majorityElement = function(nums) 
{
    let majority = -1
    const numAndCount = new Set()

    for (let i = 0; i < nums.length; i++) 
    {
        if (numAndCount[nums[i]])
            numAndCount[nums[i]]++
        else 
            numAndCount[nums[i]] = 1

        if (numAndCount[nums[i]] > nums.length / 2)
        {
            majority = nums[i];
            break;
        }
    }

    return majority
};