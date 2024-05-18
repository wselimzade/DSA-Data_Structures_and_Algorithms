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
    void walkTree(TreeNode* p, TreeNode* q, bool &same)
    {
        if (p && q) 
        {
            if (p->val != q->val)
            {
                same = false;
                return;
            }

            walkTree(p->right, q->right, same);
            walkTree(p->left, q->left, same);
        }
        else if (p && q == nullptr || q && p == nullptr)
        {
            same = false;
            return;
        }
    }
    
    bool isSameTree(TreeNode* p, TreeNode* q) {
        bool same = true;
        walkTree(p, q, same);
        return same;
    }
};