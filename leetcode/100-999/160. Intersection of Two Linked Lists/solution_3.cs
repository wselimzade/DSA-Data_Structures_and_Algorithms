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
    private int GetLength(ListNode head)
    {
        int length = 0;

        while (head != null)
        {
            head = head.next;
            length++;
        }

        return length;
    }

    public ListNode GetIntersectionNode(ListNode headA, ListNode headB)
    {
        var A = headA;
        var B = headB;

        int lenA = GetLength(A);
        int lenB = GetLength(B);

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