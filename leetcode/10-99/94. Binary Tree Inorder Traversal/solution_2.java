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
     public List<Integer> inorderTraversal(TreeNode root) 
     {
         List<Integer> values = new ArrayList<>();
         List<TreeNode> stack = new ArrayList<>();
         
         TreeNode node = root;
         
         while (node != null || stack.isEmpty() == false)
         {
             while (node != null)
             {
                 stack.add(node);
                 node = node.left;
             }
             
             node = stack.getLast();
             stack.removeLast();
             
             values.add(node.val);
             
             node = node.right;
         }
         
         return values;
     }
 }