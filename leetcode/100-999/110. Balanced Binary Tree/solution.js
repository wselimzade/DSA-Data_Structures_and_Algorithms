/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */

/** 
 * @param {TreeNode} node
 * @returns {number}
*/

var findDepth = function (node)
{
    if (node)
    {
        const leftDepth = findDepth(node.left)
        const rightDepth = findDepth(node.right)

        return Math.max(leftDepth, rightDepth) + 1
    }

    return 0
}

/**
 * @param {TreeNode}
 * @returns {boolean}
 */

var checkBalance = function (node)
{
    if (node)
    {
        const leftDepth = findDepth(node.left)
        const rightDepth = findDepth(node.right)

        if (rightDepth - leftDepth > -2 && rightDepth - leftDepth < 2)
            return true
        else
            return false
    }

    return true
}

/**
 * @param {TreeNode} root
 * @return {boolean}
 */

var isBalanced = function (root) 
{
    if (root)
        return checkBalance(root) && isBalanced(root.left) && isBalanced(root.right)

    return true
};