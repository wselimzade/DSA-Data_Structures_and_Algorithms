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
        ListNode *mergeTwoLists(ListNode *list1, ListNode *list2)
        {
            ListNode* newList = new ListNode;

            auto l1 = list1;
            auto l2 = list2;
            auto lNew = newList;

            while (l1 || l2)
            {
                auto newNode = new ListNode;
                
                if (l1 && l2)
                {
                    if (l1->val > l2->val)
                    {
                        newNode->val = l2->val;
                        lNew->next = newNode;
                        l2 = l2->next;
                    }
                    else if (l1->val < l2->val)
                    {
                        newNode->val = l1->val;
                        lNew->next = newNode;  
                        l1 = l1->next;
                    }
                    else
                    {
                        newNode->val = l1->val;
                        lNew->next = newNode;
                        lNew->next->next = new ListNode(l1->val);
                        l1 = l1->next;
                        l2 = l2->next;

                        lNew = lNew->next;
                    }
                }
                else if (l1 && !l2)
                {
                    newNode->val = l1->val;
                    lNew->next = newNode;
                    l1 = l1->next;
                }
                else
                {
                    newNode->val = l2->val;
                    lNew->next = newNode;
                    l2 = l2->next;
                }

                lNew = lNew->next;
            }
            return newList->next;
        }
};