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
        List<TreeNode> tree = new List<TreeNode>();
        List<int> treeVal = new List<int>();

        while (root != null || tree.Count > 0)
        {
            while (root != null)
            {
                tree.Add(root);
                treeVal.Add(root.val);

                root = root.left;
            }

            if (tree[tree.Count - 1].right != null)
            {
                var temp = tree[tree.Count - 1].right;
                tree.RemoveAt(tree.Count - 1);

                tree.Add(temp);
                treeVal.Add(temp.val);

                root = temp.left;
            }
            else
                tree.RemoveAt(tree.Count - 1);
        }

        return treeVal;
    }
}