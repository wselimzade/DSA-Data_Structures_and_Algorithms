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

 class Solution {
    public List<Integer> postorderTraversal(TreeNode root) 
    {
        List<Integer> values = new ArrayList<>();
        
        if (root == null) return values;
        
        List<TreeNode> stackTree = new ArrayList<>();
        stackTree.add(root);
        List<TreeNode> visitedNodes = new ArrayList<>();
        
        while (!stackTree.isEmpty())
        {
            root = stackTree.getLast();
            
            if (root.left != null && !visitedNodes.contains(root.left))
            {
                stackTree.add(root.left);
                visitedNodes.add(root.left);
            }
            else if (root.right != null && !visitedNodes.contains(root.right))
            {
                stackTree.add(root.right);
                visitedNodes.add(root.right);
            }
            else
            {
                values.add(root.val);
                stackTree.removeLast();
            }
        }
        
        return values;
    }
}