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
        void walkTree(TreeNode* left, TreeNode* right, bool &symmetric)
        {
            if (left && right)
            {
                if (left->val != right->val)
                {
                    symmetric = false;
                    return;
                }

                walkTree(left->left, right->right, symmetric);
                walkTree(left->right, right->left, symmetric);
            }
            else if (left && right == nullptr || left == nullptr && right)
            {
                symmetric = false;
                return;
            }
        }

        bool isSymmetric(TreeNode* root) {
            bool symmetric = true;

            if (root->left && root->right)
            {
                walkTree(root->left, root->right, symmetric);
            }
            else if (root->left && root->right == nullptr || root->left == nullptr && root->right)
            {
                symmetric = false;
            }

            return symmetric;
        }
};