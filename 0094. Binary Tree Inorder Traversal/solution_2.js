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

var inorderTraversal = function (root) 
{
    const values = []
    const stack = []

    let node = root

    while (node != null || stack.length != 0)
    {
        while (node)
        {
            stack.push(node)
            node = node.left
        }

        node = stack.pop();

        values.push(node.val)

        node = node.right
    }

    return values
};