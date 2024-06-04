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
 
var postorderTraversal = function(root) 
{
    const values = []

    if (!root) return values

    const stackTree = [root]
    const visitedNodes = []

    while (stackTree.length > 0)
    {
        const root = stackTree[stackTree.length - 1]

        if (root.left && !visitedNodes.includes(root.left))
        {
            stackTree.push(root.left)
            visitedNodes.push(root.left)
        }
        else if (root.right && !visitedNodes.includes(root.right))
        {
            stackTree.push(root.right)
            visitedNodes.push(root.right)
        }
        else
        {
            values.push(root.val)
            stackTree.pop()
        }
    }     

    return values
};