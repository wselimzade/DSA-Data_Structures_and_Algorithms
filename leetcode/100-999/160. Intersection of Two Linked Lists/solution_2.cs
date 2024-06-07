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
        HashSet<ListNode> nodes = new HashSet<ListNode>();
        ListNode node = null;

        node = headA;
        while (node != null)
        {
            nodes.Add(node);
            node = node.next;
        }

        node = headB;
        while (node != null)
        {
            if (nodes.Contains(node))
                return node;

            node = node.next;
        }

        return null;
    }
}