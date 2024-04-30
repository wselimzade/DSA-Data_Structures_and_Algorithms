/**
 * @param {number[]} nums
 * @param {number} val
 * @return {number}
 */

var removeElement = function(nums, val) 
{
    const newNums = new Array
    let find = 0;
    nums.forEach(n => {
        if (n != val) newNums.push(n)
        else find++;
    });

    nums.splice(0, newNums.length, ...newNums)

    return nums.length - find
};