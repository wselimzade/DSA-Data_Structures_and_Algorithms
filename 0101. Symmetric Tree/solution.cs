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
    public void WalkTree(TreeNode left, TreeNode right, ref bool symmetric)
    {
        if (left != null && right != null)
        {
            if (left.val != right.val)
            {
                symmetric = false;
                return;
            }

            WalkTree(left.left, right.right, ref symmetric);
            WalkTree(left.right, right.left, ref symmetric);
        }
        else if (left != null && right == null || left == null && right != null)
        {
            symmetric = false;
            return;
        }
    }
    public bool IsSymmetric(TreeNode root)
    {
        bool symmetric = true;

        if (root.left != null && root.right != null)
            WalkTree(root.left, root.right, ref symmetric);
        else if (root.left != null && root.right == null || root.left == null && root.right != null)
            symmetric = false;

        return symmetric;
    }
}