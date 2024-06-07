/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class Solution 
{
    private int getLength(ListNode head)
    {
        int length = 0;

        while (head != null)
        {
            head = head.next;
            length++;
        }

        return length;
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) 
    {
        var A = headA;
        var B = headB;

        int lenA = getLength(A);
        int lenB = getLength(B);

        while (lenA > lenB)
        {
            A = A.next;
            lenA--;
        }

        while (lenB > lenA)
        {
            B = B.next;
            lenB--;
        }

        while (A != B)
        {
            A = A.next;
            B = B.next;
        }

        return A;
    }
}