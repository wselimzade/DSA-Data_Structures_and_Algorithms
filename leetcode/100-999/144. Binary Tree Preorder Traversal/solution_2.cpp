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
        vector<int> preorderTraversal(TreeNode *root)
        {
            vector<TreeNode*> tree;
            vector<int> treeVal;

            while (root || !tree.empty())
            {
                while (root)
                {
                    tree.push_back(root);
                    treeVal.push_back(root->val);

                    root = root->left;
                }   

                if (tree.back()->right)
                {
                    auto temp = tree.back()->right;
                    tree.pop_back();

                    tree.push_back(temp);
                    treeVal.push_back(temp->val);
                    
                    root = temp->left;
                }
                else
                {
                    tree.pop_back();
                }
            }

            return treeVal;
        }
};