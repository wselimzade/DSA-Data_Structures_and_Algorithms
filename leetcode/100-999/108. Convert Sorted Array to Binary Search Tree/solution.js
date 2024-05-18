/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */

/** 
 * @param {number[]} nums
 * @param {number} left
 * @param {number} right
 * @returns {TreeNode}
*/

var createBTS = function(nums, left, right)
{
    if (left > right)
        return null

    const mid = Math.floor((right - left) / 2) + left
    const node = new TreeNode(nums[mid])

    node.left = createBTS(nums, left, mid - 1)
    node.right = createBTS(nums, mid + 1, right)

    return node
}

/**
 * @param {number[]} nums
 * @return {TreeNode}
 */

var sortedArrayToBST = function(nums) 
{
    const head = createBTS(nums, 0, nums.length -1)
    return head
};