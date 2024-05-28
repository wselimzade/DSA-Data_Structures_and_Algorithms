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
    let tree = []
    let treeVal = []

    while (root || tree.length > 0)
    {
        while (root)
        {
            tree.push(root)
            treeVal.push(root.val)

            root = root.left
        }

        if (tree[tree.length - 1].right)
        {
            const temp = tree[tree.length - 1].right
            tree.pop()
            
            tree.push(temp)
            treeVal.push(temp.val)

            root = temp.left
        }
        else
            tree.pop()
    }    

    return treeVal
};