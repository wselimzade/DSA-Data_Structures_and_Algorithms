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
        int minDepth(TreeNode* root) 
        {
            if (root)
            {
                int minDepth = 1;

                vector<TreeNode*> nodes = {root};

                while (!nodes.empty())
                {
                    vector<TreeNode*> newNodes;

                    for (auto node : nodes)
                    {
                        if (!node->left && !node->right)
                            return depth;

                        if (node->left)
                            newNodes.push_back(node->left);
                        
                        if (node->right)
                            newNodes.push_back(node->right);
                    }

                    nodes.assign(newNodes.begin(), newNodes.end());
                    minDepth++;
                }

                return minDepth;
            }   

            return 0; 
        }
};