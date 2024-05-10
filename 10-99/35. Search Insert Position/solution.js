/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */

var searchInsert = function(nums, target) 
{
    let left = 0
    let right = nums.length - 1
    
    while (left <= right)
    {
        let mid = Math.floor((right - left) / 2) + left

        if (nums[mid] == target)
            return mid

        nums[mid] > target 
            ? right = mid - 1
            : left = mid + 1
    }

    return left;
};