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
    public TreeNode createBTS(int[] nums, int left, int right)
    {
        if (left > right)
            return null;
        
        int mid = (right - left) / 2 + left;
        TreeNode node = new TreeNode(nums[mid]);
        
        node.left = createBTS(nums, left, mid - 1);
        node.right = createBTS(nums, mid + 1, right);
        
        return node;
    }
    
    public TreeNode sortedArrayToBST(int[] nums) 
    {
        TreeNode head = createBTS(nums, 0, nums.length - 1);
        return head;
    }
}