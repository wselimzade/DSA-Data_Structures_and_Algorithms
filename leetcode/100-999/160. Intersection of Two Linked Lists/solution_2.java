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
    public ListNode getIntersectionNode(ListNode headA, ListNode headB)
    {
        HashSet<ListNode> nodes = new HashSet<>();
        ListNode node = null;

        node = headA;
        while (node != null)
        {
            nodes.add(node);
            node = node.next;
        }
        
        node = headB;
        while (node != null)
        {
            if (nodes.contains(node))
                return node;
            
            node = node.next;
        }
        
        return null;
    }
}