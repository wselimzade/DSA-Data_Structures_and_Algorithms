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
            vector<int> treeVal;

            if (!root) return treeVal;

            vector<TreeNode*> tree;
            tree.push_back(root);

            while (!tree.empty())
            {
                auto node = tree.back();
                tree.pop_back();
                treeVal.push_back(node->val);

                if (node->right)
                    tree.push_back(node->right);

                if (node->left)
                    tree.push_back(node->left);
            }

            return treeVal;
        }
};