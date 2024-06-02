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
    private List<int> treeVal = new List<int>();

    public IList<int> PostorderTraversal(TreeNode root) 
    {
        if (root != null)
        {
            PostorderTraversal(root.left);
            PostorderTraversal(root.right);
            treeVal.Add(root.val);
        }

        return treeVal;
    }
}