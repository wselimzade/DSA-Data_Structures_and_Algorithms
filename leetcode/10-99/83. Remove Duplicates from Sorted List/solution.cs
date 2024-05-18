/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     public int val;
 *     public ListNode next;
 *     public ListNode(int val=0, ListNode next=null) {
 *         this.val = val;
 *         this.next = next;
 *     }
 * }
 */

public class Solution
{
    public ListNode DeleteDuplicates(ListNode head)
    {
        if (head == null) return head;

        ListNode newList = new ListNode(head.val);

        var newL = newList;
        while (head.next != null)
        {
            if (newL.val != head.next.val)
            {
                newL.next = new ListNode(head.next.val);
                newL = newL.next;
            }

            head = head.next;
        }

        return newList;
    }
}