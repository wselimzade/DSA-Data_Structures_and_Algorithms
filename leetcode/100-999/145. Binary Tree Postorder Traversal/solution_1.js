
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
 * @param {number[]} tree
 * @return {void}
 */

function walkTree(tree, root)
{
   if (root)
   {
       walkTree(tree, root.left);
       walkTree(tree, root.right);
       tree.push(root.val);
   }
}

/**
* @param {TreeNode} root
* @return {number[]}
*/

var postorderTraversal = function(root) 
{
   const tree = []
   walkTree(tree, root)
   return tree
};