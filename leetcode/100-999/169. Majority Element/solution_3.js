/**
 * @param {number[]} nums
 * @return {number}
 */

var majorityElement = function(nums) 
{
    let majority = -111
    let count = 0    

    for (const num of nums)
    {
        if (count == 0)
            majority = num

        majority == num 
            ? ++count
            : --count
    }

    return majority
};