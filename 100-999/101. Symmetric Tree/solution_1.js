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
 * @param {object} symmetric
 * @return {boolean}
 */

var walkTree = function(left, right, symmetric)
{
    if (left && right)
    {
        if (left.val != right.val)
        {
            symmetric.value = false
            return
        }

        walkTree(left.left, right.right, symmetric)
        walkTree(left.right, right.left, symmetric)
    }
    else if (left && !right || !left && right)
    {
        symmetric.value = false
        return
    }
}

/**
 * @param {TreeNode} root
 * @return {boolean}
 */

var isSymmetric = function(root) 
{
    const symmetric = {value: true}
    
    if (root.left && root.right)
    {
        walkTree(root.left, root.right, symmetric)
    }
    else if (root.left && !root.right || !root.left && root.right)
        symmetric.value = false

    return symmetric.value
};