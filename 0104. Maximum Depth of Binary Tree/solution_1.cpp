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
        int maxDepth(TreeNode* root) 
        {
            int depth = 0;

            if (root)
            {
                vector<TreeNode*> nodes = {root};

                while (!nodes.empty())
                {
                    vector<TreeNode*> nextNodes;

                    for (auto node : nodes)
                    {
                        if (node->left)
                            nextNodes.push_back(node->left);
                        
                        if (node->right)
                            nextNodes.push_back(node->right);
                    }

                    nodes.clear();
                    nodes.assign(nextNodes.begin(), nextNodes.end());

                    depth++;
                }

            }

            return depth;
        }
};