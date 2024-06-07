/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */

class Solution 
{
    public:
        ListNode *getIntersectionNode(ListNode *headA, ListNode *headB) 
        {
            set<ListNode*> nodes;
            ListNode* node;
            
            node = headA;
            while (node)
            {
                nodes.insert(node);
                node = node->next;
            }

            node = headB;
            while (node)
            {
                if (nodes.find(node) != nodes.end())
                    return node;

                node = node->next;
            }
            
            return nullptr;
        }
};