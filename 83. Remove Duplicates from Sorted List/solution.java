/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

 class Solution 
 {
     public ListNode deleteDuplicates(ListNode head)
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