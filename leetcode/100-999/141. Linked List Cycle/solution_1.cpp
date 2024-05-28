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
    bool hasCycle(ListNode *head)
    {
        set<ListNode *> memoryAddress;

        auto h = head;
        while (h)
        {
            if (find(memoryAddress.begin(), memoryAddress.end(), h) == memoryAddress.end())
                {
                    memoryAddress.emplace(h);
                    h = h->next;
                }
            else
                return true;
        }

        return false;
    }
};