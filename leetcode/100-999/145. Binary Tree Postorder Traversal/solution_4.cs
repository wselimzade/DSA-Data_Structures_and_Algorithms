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
    public IList<int> PostorderTraversal(TreeNode root) 
    {
        List<int> values = new List<int>();

        if (root == null) return values;

        List<TreeNode> tree = new List<TreeNode>() { root };

        while (tree.Count > 0)
        {
            root = tree[tree.Count - 1];
            tree.RemoveAt(tree.Count - 1);

            values.Insert(0, root.val);

            if (root.left != null)
                tree.Add(root.left);

            if (root.right != null)
                tree.Add(root.right);
        }

        return values;
    }
}