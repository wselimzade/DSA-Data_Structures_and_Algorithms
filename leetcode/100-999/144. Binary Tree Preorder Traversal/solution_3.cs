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
    public IList<int> PreorderTraversal(TreeNode root)
    {

        List<int> treeVal = new List<int>();

        if (root == null) return treeVal;

        List<TreeNode> tree = new List<TreeNode>();
        tree.Add(root);

        while (tree.Count > 0)
        {
            var node = tree[tree.Count - 1];
            tree.RemoveAt(tree.Count - 1);
            treeVal.Add(node.val);

            if (node.right != null)
                tree.Add(node.right);

            if (node.left != null)
                tree.Add(node.left);
        }

        return treeVal;
    }
}