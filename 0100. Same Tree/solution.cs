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
    public void WalkTree(TreeNode p, TreeNode q, ref bool same)
    {
        if (p != null && q != null)
        {
            if (p.val != q.val)
                same = false;

            WalkTree(p.left, q.left, ref same);
            WalkTree(p.right, q.right, ref same);
        }
        else if (p != null && q == null || p == null && q != null)
            same = false;
    }

    public bool IsSameTree(TreeNode p, TreeNode q)
    {
        bool same = true;
        WalkTree(p, q, ref same);
        return same;
    }
}