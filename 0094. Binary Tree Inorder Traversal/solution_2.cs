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
    public IList<int> InorderTraversal(TreeNode root)
    {
        List<int> values = new List<int>();
        List<TreeNode> stack = new List<TreeNode>();

        TreeNode node = root;

        while (node != null || stack.Count != 0)
        {
            while (node != null)
            {
                stack.Add(node);
                node = node.left;
            }

            node = stack.Last();
            stack.RemoveAt(stack.Count - 1);

            values.Add(node.val);

            node = node.right;
        }

        return values;
    }
}