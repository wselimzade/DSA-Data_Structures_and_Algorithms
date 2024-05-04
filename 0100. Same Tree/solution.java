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
    public void WalkTree(TreeNode p, TreeNode q, boolean[] same)
    {
        if (p != null && q != null)
        {
            if (p.val != q.val)
            {
                same[0] = false;
                return;
            }
            
            WalkTree(p.left, q.left, same);
            WalkTree(p.right, q.right, same);
        }
        else if (p != null && q == null || p == null && q != null)
        {
            same[0] = false;
            return;
        }
    }
    
    public boolean isSameTree(TreeNode p, TreeNode q) 
    {
        boolean[] same = {true};
        WalkTree(p, q, same);
        return same[0];
    }
}