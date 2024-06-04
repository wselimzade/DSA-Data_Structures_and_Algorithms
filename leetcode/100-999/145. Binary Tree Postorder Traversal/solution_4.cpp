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

class Solution {
public:
    vector<int> postorderTraversal(TreeNode* root) 
    {
        vector<int> values;

        if (!root) return values;

        vector<TreeNode*> tree = {root};

        while (!tree.empty())
        {
            root = tree.back();
            tree.pop_back();

            values.insert(values.begin(), root->val);

            if (root->left)
                tree.push_back(root->left);

            if (root->right)
                tree.push_back(root->right);
        }

        return values;
    }
};