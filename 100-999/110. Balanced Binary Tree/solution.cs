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
    public int findDepth(TreeNode node)
    {
        if (node != null)
        {
            int leftDepth = findDepth(node.left);
            int rightDepth = findDepth(node.right);

            return Math.Max(leftDepth, rightDepth) + 1;
        }

        return 0;
    }

    public bool CheckBalance(TreeNode node)
    {
        if (node != null)
        {
            int leftDepth = findDepth(node.left);
            int rightDepth = findDepth(node.right);

            if (rightDepth - leftDepth > -2 && rightDepth - leftDepth < 2)
                return true;
            else
                return false;
        }

        return true;
    }


    public bool IsBalanced(TreeNode root)
    {
        if (root != null)
            return CheckBalance(root) && IsBalanced(root.left) && IsBalanced(root.right);

        return true;
    }
}