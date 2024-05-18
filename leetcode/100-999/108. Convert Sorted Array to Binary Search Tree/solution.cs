/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left;
 *     public TreeNode right;
 *     public TreeNode(int val=0, TreeNode left=null, TreeNode right=null) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

public class Solution
{
    public TreeNode CreateBTS(int[] nums, int left, int right)
    {
        if (left > right)
            return null;

        int mid = (right - left) / 2 + left;
        TreeNode node = new TreeNode(nums[mid]);

        node.left = CreateBTS(nums, left, mid - 1);
        node.right = CreateBTS(nums, mid + 1, right);

        return node;
    }


    public TreeNode SortedArrayToBST(int[] nums)
    {
        TreeNode head = CreateBTS(nums, 0, nums.Length - 1);
        return head;
    }
}