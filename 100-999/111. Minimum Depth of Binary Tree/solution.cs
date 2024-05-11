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
    public int MinDepth(TreeNode root)
    {
        if (root != null)
        {
            int minDepth = 1;

            List<TreeNode> nodes = new List<TreeNode>{ root };

            while (nodes.Count > 0)
            {
                List<TreeNode> newNodes = new List<TreeNode>();

                foreach(var node in nodes)
                {
                    if (node.left == null && node.right == null)
                        return minDepth;

                    if (node.left != null)
                        newNodes.Add(node.left);

                    if (node.right != null)
                        newNodes.Add(node.right);
                }

                nodes.Clear();
                nodes.AddRange(newNodes);
                minDepth++;
            }

            return minDepth;
        }

        return 0;
    }
}