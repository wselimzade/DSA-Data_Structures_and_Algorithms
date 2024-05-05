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
     public int maxDepth(TreeNode root)
     {
         int depth = 0;
 
         if (root != null)
         {
             ArrayList<TreeNode> nodes = new ArrayList<>();
             nodes.add(root);
 
             while (!nodes.isEmpty())
             {
                 ArrayList<TreeNode> nextNodes = new ArrayList<>();
                 
                 for (var node : nodes)
                 {
                     if (node.left != null)
                         nextNodes.add(node.left);
                     
                     if (node.right != null)
                         nextNodes.add(node.right);
                 }
                 
                 nodes.clear();
                 nodes.addAll(nextNodes);
                 
                 depth++;
             }
         }
         
         return depth;
     }
 }