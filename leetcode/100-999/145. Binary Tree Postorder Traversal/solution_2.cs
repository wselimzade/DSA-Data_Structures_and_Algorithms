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

        List<TreeNode> stackRoot = new List<TreeNode>() { root };
        List<TreeNode> stackNode = new List<TreeNode>();

        while (stackRoot.Count > 0)
        {
            var node = stackRoot[stackRoot.Count - 1];

            stackNode.Add(node);
            stackRoot.RemoveAt(stackRoot.Count - 1);

            if (node.left != null)
                stackRoot.Add(node.left);
            
            if (node.right != null)
                stackRoot.Add(node.right);
        }

        while (stackNode.Count > 0)
        {
            var node = stackNode[stackNode.Count - 1];

            values.Add(node.val);
            stackNode.RemoveAt(stackNode.Count - 1);
        }

        return values;
    }
}