/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution
{
    private List<Integer> tree = new ArrayList<>();
    
    public List<Integer> preorderTraversal(TreeNode root)
    {
        if (root != null)
        {
            tree.add(root.val);
            
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
        
        return tree;
    }
}