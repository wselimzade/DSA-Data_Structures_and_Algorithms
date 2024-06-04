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

        List<TreeNode> stackTree = new List<TreeNode>() { root };
        List<TreeNode> visitedNodes = new List<TreeNode>();

        while (stackTree.Count > 0)
        {
            root = stackTree[stackTree.Count - 1];

            if (root.left != null && !visitedNodes.Contains(root.left))
            {
                stackTree.Add(root.left);
                visitedNodes.Add(root.left);
            }
            else if (root.right != null && !visitedNodes.Contains(root.right))
            {
                stackTree.Add(root.right);
                visitedNodes.Add(root.right);
            }
            else
            {
                values.Add(root.val);
                stackTree.RemoveAt(stackTree.Count - 1);
            }
        }

        return values;
    }
}