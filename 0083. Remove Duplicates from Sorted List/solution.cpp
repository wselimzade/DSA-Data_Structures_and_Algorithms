/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */

class Solution
{
    public:
        ListNode *deleteDuplicates(ListNode *head)
        {
            if (head == nullptr) return head;

            ListNode *newList = new ListNode(head->val);

            auto newL = newList;
            while (head->next)
            {
                if (newL->val != head->next->val)
                {
                    newL->next = new ListNode(head->next->val);
                    newL = newL->next;
                }

                head = head->next;
            }

            return newList;
        }
};