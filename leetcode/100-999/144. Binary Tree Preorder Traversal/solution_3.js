/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */

/**
 * @param {TreeNode} root
 * @return {number[]}
 */

var preorderTraversal = function(root) 
{
    const treeVal = []

    if (!root) return treeVal

    const tree = [root]

    while (tree.length > 0)
    {
        const node = tree.pop()
        treeVal.push(node.val)

        if (node.right)
            tree.push(node.right)
        
        if (node.left)
            tree.push(node.left)
    }

    return treeVal
};