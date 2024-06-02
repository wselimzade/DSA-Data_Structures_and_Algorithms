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
     public List<Integer> postorderTraversal(TreeNode root)
     {
         List<Integer> values = new ArrayList<>();
 
         if (root == null) return values;
 
         List<TreeNode> stackRoot = new ArrayList<>();
         stackRoot.add(root);
         List<TreeNode> stackNode = new ArrayList<>();
 
         while (!stackRoot.isEmpty())
         {
             var node = stackRoot.getLast();
 
             stackNode.add(node);
             stackRoot.removeLast();
 
             if (node.left != null)
                 stackRoot.add(node.left);
 
             if (node.right != null)
                 stackRoot.add(node.right);
         }
 
         while (!stackNode.isEmpty())
         {
             var node = stackNode.getLast();
 
             values.add(node.val);
             stackNode.removeLast();
         }
 
         return values;
     }
 }