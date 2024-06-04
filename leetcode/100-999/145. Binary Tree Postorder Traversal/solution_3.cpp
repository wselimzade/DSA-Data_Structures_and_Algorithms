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

            vector<TreeNode*> stackTree = {root};
            vector<TreeNode*> visitedNodes;

            while (!stackTree.empty())
            {
                root = stackTree.back();

                if (root->left &&
                find(visitedNodes.begin(), visitedNodes.end(), root->left) == visitedNodes.end())
                {
                    stackTree.push_back(root->left);
                    visitedNodes.push_back(root->left);
                }
                else if (root->right &&
                find(visitedNodes.begin(), visitedNodes.end(), root->right) == visitedNodes.end())
                {
                    stackTree.push_back(root->right);
                    visitedNodes.push_back(root->right);
                }
                else
                {
                    values.push_back(root->val);
                    stackTree.pop_back();
                }
            }    

            return values;
        }
};