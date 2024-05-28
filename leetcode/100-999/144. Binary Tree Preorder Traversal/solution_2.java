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
    public List<Integer> preorderTraversal(TreeNode root)
    {
        List<TreeNode> tree = new ArrayList<>();
        List<Integer> treeVal = new ArrayList<>();

        while (root != null || !tree.isEmpty())
        {
            while (root != null)
            {
                tree.add(root);
                treeVal.add(root.val);

                root = root.left;
            }

            if (tree.get(tree.size() - 1).right != null)
            {
                var temp = tree.get(tree.size() - 1).right;
                tree.removeLast();
                
                tree.add(temp);
                treeVal.add(temp.val);
                
                root = temp.left;
            }
            else 
                tree.removeLast();
        }
        
        return treeVal;
    }
}