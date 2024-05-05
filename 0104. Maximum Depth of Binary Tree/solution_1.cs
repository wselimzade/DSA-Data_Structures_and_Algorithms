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
    public int MaxDepth(TreeNode root)
    {
        int depth = 0;

        if (root != null)
        {
            List<TreeNode> nodes = new List<TreeNode> { root };

            while (nodes.Count > 0)
            {
                List<TreeNode> nextNodes = new List<TreeNode>();

                foreach (var node in nodes)
                {
                    if (node.left != null)
                        nextNodes.Add(node.left);

                    if (node.right != null)
                        nextNodes.Add(node.right);
                }

                nodes.Clear();
                nodes.AddRange(nextNodes);

                depth++;
            }
        }

        return depth;
    }
}