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
            auto A = headA;
            auto B = headB;

            while (A && B)
            {
                if (A == B)
                    return A;
                else
                {
                    if (A->next == nullptr)
                    {
                        A = headA;
                        B = B->next;
                    }
                    else
                        A = A->next;
                }
            }    

            return nullptr;
        }
};