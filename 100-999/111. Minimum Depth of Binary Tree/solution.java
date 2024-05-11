/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution 
{
    public int minDepth(TreeNode root) 
    {
        if (root != null)
        {
            int minDepth = 1;
            
            ArrayList<TreeNode> nodes = new ArrayList<>();
            nodes.add(root);
            
            while (!nodes.isEmpty())
            {
                ArrayList<TreeNode> newNodes = new ArrayList<>();
                
                for (var node : nodes)
                {
                    if (node.left == null && node.right == null)
                        return minDepth;
                    
                    if (node.left != null)
                        newNodes.add(node.left);
                    
                    if (node.right != null)
                        newNodes.add(node.right);
                }
                
                nodes.clear();
                nodes.addAll(newNodes);
                minDepth++;
            }
            
            return minDepth;
        }
        
        return 0;
    }
}