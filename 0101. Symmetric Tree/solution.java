/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */

 class Solution 
 {
     public void walkTree(TreeNode left, TreeNode right, boolean[] symmetric)
     {
         if (left != null && right != null)
         {
             if (left.val != right.val)
             {
                 symmetric[0] = false;
                 return;
             }
 
             walkTree(left.left, right.right, symmetric);
             walkTree(left.right, right.left, symmetric);
         }
         else if (left != null && right == null || left == null && right != null)
         {
             symmetric[0] = false;
             return;
         }
     }
 
     public boolean isSymmetric(TreeNode root) 
     {
         boolean[] symmetric = {true};
 
         if (root.left != null && root.right != null)
             walkTree(root.left, root.right, symmetric);
         else if (root.left != null && root.right == null || root.left == null && root.right != null)
             symmetric[0] = false;
 
         return symmetric[0];
     }
 }