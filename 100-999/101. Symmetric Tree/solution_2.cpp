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
        bool walkSymmetric(TreeNode* left, TreeNode* right)
        {
            if (!left && !right)
                return true;
            
            if (!left || !right)
                return false;

            
            return walkSymmetric(left->left, right->right) && walkSymmetric(left->right, right->left) && left->val == right->val;        
        }

        bool isSymmetric(TreeNode* root) 
        {
            if (root)
                return walkSymmetric(root->left, root->right);
  
            return false;
        }
};