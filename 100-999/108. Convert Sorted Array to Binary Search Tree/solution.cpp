/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */

class Solution 
{
    public:
        TreeNode* createBTS(vector<int> nums, int left, int right)
        {
            if (left > right)
                return nullptr;

            int mid = (right - left) / 2 + left;
            TreeNode* node = new TreeNode(nums[mid]);

            node->left = createBTS(nums, left, mid - 1);
            node->right = createBTS(nums, mid + 1, right);

            return node;
        }

        TreeNode* sortedArrayToBST(vector<int>& nums) 
        {
            TreeNode* head = createBTS(nums, 0, size(nums) - 1);
            return head;    
        }
};