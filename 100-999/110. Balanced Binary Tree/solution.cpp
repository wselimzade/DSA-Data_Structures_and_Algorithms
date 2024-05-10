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
        int findDepth(TreeNode* node)
        {
            if (node)
            {
                int leftDepth = findDepth(node->left);
                int rightDepth = findDepth(node->right);
                
                return max(leftDepth, rightDepth) + 1;
            }

            return 0;
        }


        bool checkBalance(TreeNode* node)
        {
            if (node)
            {
                int leftDepth = findDepth(node->left);
                int rightDepth = findDepth(node->right);

                if (rightDepth - leftDepth > -2 && rightDepth - leftDepth < 2)
                    return true;
                else
                    return false;
            }

            return true;
        }

        bool isBalanced(TreeNode* root) 
        {
            if (root)
                return checkBalance(root) && isBalanced(root->left) && isBalanced(root->right);

            return true;
        }
};