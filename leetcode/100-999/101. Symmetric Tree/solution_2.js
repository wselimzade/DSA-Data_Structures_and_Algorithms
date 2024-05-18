/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */

/**
 * @param {TreeNode} left
 * @param {TreeNode} right
 * @return {boolean}
 */

var walkSymmetric = function(left, right)
{
    if (!left && !right)
        return true
    if (!left || !right)
        return false

    return walkSymmetric(left.left, right.right) && walkSymmetric(left.right, right.left) && left.val == right.val
}

/**
 * @param {TreeNode} root
 * @return {boolean}
 */

var isSymmetric = function(root) 
{
    if (root)
        return walkSymmetric(root.left, root.right)

    return false
};