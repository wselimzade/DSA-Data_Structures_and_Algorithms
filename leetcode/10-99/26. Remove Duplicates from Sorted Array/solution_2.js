/**
 * @param {number[]} nums
 * @return {number}
 */

var removeDuplicates = function(nums) 
{
    let numSet = new Set(nums);
    nums.splice(0, numSet.size, ...numSet);
    return numSet.size;
};