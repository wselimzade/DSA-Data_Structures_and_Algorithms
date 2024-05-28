/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     public int val;
 *     public ListNode next;
 *     public ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class Solution
{
    public bool HasCycle(ListNode head)
    {
        HashSet<ListNode> memoryAddress = new HashSet<ListNode>();

        var h = head;
        while (h != null)
        {
            if (!memoryAddress.Contains(h))
            {
                memoryAddress.Add(h);
                h = h.next;
            }
            else
                return true;
        }

        return false;
    }
}