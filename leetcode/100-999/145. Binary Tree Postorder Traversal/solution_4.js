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
    const values = [];
    if (!root) return values;

    const tree = [root];

    while (tree.length > 0) {
        const root = tree.pop();

        values.unshift(root.val);

        if (root.left)
            tree.push(root.left);

        if (root.right)
            tree.push(root.right);
    }

    return values;    
};