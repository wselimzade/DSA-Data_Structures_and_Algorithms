/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     public int val;
 *     public ListNode next;
 *     public ListNode(int x) { val = x; }
 * }
 */

public class Solution 
{
    public ListNode GetIntersectionNode(ListNode headA, ListNode headB) 
    {
        var A = headA;
        var B = headB;

        while (A != null && B != null)
        {
            if (A == B)
                return A;
            else
            {
                if (A.next == null)
                {
                    A = headA;
                    B = B.next;
                }
                else
                    A = A.next;
            }
        }

        return null;
    }
}