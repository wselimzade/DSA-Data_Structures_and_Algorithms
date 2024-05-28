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
     public List<Integer> preorderTraversal(TreeNode root)
     {
         var treeVal = new ArrayList<Integer>();
 
         if (root == null) return treeVal;
 
         var tree = new ArrayList<TreeNode>();
         tree.add(root);
 
         while (!tree.isEmpty())
         {
             var node = tree.get(tree.size() - 1);
             tree.remove(tree.size() - 1);
             treeVal.add(node.val);
 
             if (node.right != null)
                 tree.add(node.right);
 
             if (node.left != null)
                 tree.add(node.left);
         }
 
         return treeVal;
     }
 }