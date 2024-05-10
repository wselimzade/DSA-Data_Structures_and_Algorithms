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
    public int findDepth(TreeNode node)
    {
        if (node != null)
        {
            int leftDepth = findDepth(node.left);
            int righDepth = findDepth(node.right);
            
            return Math.max(leftDepth, righDepth) + 1;
        }
        
        return 0;
    }
    
    public boolean checkBalance(TreeNode node)
    {
        if (node != null)
        {
            int leftDepth = findDepth(node.left);
            int righDepth = findDepth(node.right);
            
            if (righDepth - leftDepth > -2 && righDepth - leftDepth < 2)
                return true;
            else 
                return false;
        }
        
        return true;
    }
    
    public boolean isBalanced(TreeNode root) 
    {
        if (root != null)
            return checkBalance(root) && isBalanced(root.left) && isBalanced(root.right);
        
        return true;
    }
}