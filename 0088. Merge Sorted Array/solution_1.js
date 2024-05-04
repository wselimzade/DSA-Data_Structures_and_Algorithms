/** 
 * @param {number} index
 * @param {numer[]} nums
 * @param {number} add
 * @returns {void}
 */  

var myInsert = function(index, nums, add)
{
    const temp = nums[index]
    nums[index] = add

    for (let i = nums.length - 1; i >= index + 1; --i)
    {
        if (i == index + 1)
        {
            nums[i] = temp
            break
        }

        nums[i] = nums[i - 1]
    }
}

/**
 * @param {number[]} nums1
 * @param {number} m
 * @param {number[]} nums2
 * @param {number} n
 * @return {void} Do not return anything, modify nums1 in-place instead.
 */

var merge = function(nums1, m, nums2, n) 
{
    for (let i = 0; i < n; ++i)
    {
        const add = nums2[i]

        for (let j = 0; j < m + n; ++j)
        {
            const curr = nums1[j]

            if (add < curr || (curr == 0 && j >= m + i) || add == curr)
            {
                myInsert(j, nums1, add)
                break
            }
        }
    }
};