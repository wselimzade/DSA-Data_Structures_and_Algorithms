/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left;
 *     public TreeNode right;
 *     public TreeNode(int val=0, TreeNode left=null, TreeNode right=null) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class Solution
{
    public bool WalkSymmetric(TreeNode left, TreeNode right)
    {
        if (left == null && right == null)
            return true;
        if (left == null || right == null)
            return false;

        return WalkSymmetric(left.left, right.right) && WalkSymmetric(left.right, right.left) && left.val == right.val;
    }
    
    public bool IsSymmetric(TreeNode root)
    {
        if (root != null)
            return WalkSymmetric(root.left, root.right);

        return false;
    }
}