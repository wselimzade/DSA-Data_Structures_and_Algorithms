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

    const stackRoot = [root]
    const stackNode = []

    while (stackRoot.length > 0)
    {
        const node = stackRoot.pop()

        stackNode.push(node)

        if (node.left)
            stackRoot.push(node.left)

        if (node.right)
            stackRoot.push(node.right)
    }

    while (stackNode.length > 0)
    {
        const node = stackNode.pop()
        values.push(node.val)
    }       

    return values
};