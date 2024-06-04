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

        List<TreeNode> tree = new ArrayList<>();
        tree.add(root);

        while (!tree.isEmpty()) {
            root = tree.get(tree.size() - 1);
            tree.remove(tree.size() - 1);

            values.add(0, root.val);

            if (root.left != null)
                tree.add(root.left);

            if (root.right != null)
                tree.add(root.right);
        }

        return values;
    }
}