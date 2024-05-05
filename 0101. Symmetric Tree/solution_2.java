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
     private boolean walkSymmetric(TreeNode left, TreeNode right) 
     {
         if (left == null && right == null)
             return true;
         if (left == null || right == null)
             return false;
         
         return walkSymmetric(left.left, right.right) && walkSymmetric(left.right, right.left) && left.val == right.val;
     }
     
     public boolean isSymmetric(TreeNode root) 
     {
         if (root != null)
             return walkSymmetric(root.left, root.right);
         
         return false;
     }
 }