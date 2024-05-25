/**
 * @param {number[]} nums
 * @return {number}
 */

var singleNumber = function(nums) 
{   
   const numsAndCount = new Map()

   for (const n of nums)
        if (numsAndCount.has(n))
            numsAndCount.set(n, numsAndCount.get(n) + 1)
        else
            numsAndCount.set(n, 1)

   for (const [key, value] of numsAndCount.entries())
        if (value == 1)
            return key

   return -1
};