/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */


/**
 * @param {number[]} tree
 * @param {TreeNode} root
 * @return {void}
 */

function walkTree(tree, root)
{
    if (root)
    {
        tree.push(root.val)

        walkTree(tree, root.left)
        walkTree(tree, root.right)
    }
}

/**
 * @param {TreeNode} root
 * @return {number[]}
 */

var preorderTraversal = function(root) 
{
    const tree = [] 
    walkTree(tree, root)
    return tree
};