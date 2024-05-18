/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */

/** 
 * @param {TreeNode} p
 * @param {TreeNode} q
 * @param {object} same
 * @return {void}
 * **/

var walkTree = function(p, q, same)
{
    if (p && q)
    {
        if (p.val != q.val)
        {
            same.value = false
            return
        }

        walkTree(p.left, q.left, same)
        walkTree(p.right, q.right, same)
    }
    else if ((p && q == null) || (p == null && q))
    {
        same.value = false
        return
    }
}

/**
 * @param {TreeNode} p
 * @param {TreeNode} q
 * @return {boolean}
 */

var isSameTree = function(p, q) {
    const same = { value: true }
    walkTree(p, q, same)
    return same.value
};