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
        vector<int> postorderTraversal(TreeNode* root) 
        {
            vector<int> values;
            if (!root) return values; 

            vector<TreeNode*> stackRoot = {root};
            vector<TreeNode*> stackNode;   
        
            while (!stackRoot.empty())
            {
                auto node = stackRoot.back();

                stackNode.push_back(node);
                stackRoot.pop_back();

                if (node->left)
                    stackRoot.push_back(node->left);

                if (node->right)
                    stackRoot.push_back(node->right);
            }

            while (!stackNode.empty())
            {
                auto node = stackNode.back();
                values.push_back(node->val);
                stackNode.pop_back();
            }

            return values;
        }
};