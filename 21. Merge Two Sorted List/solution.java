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
     public ListNode mergeTwoLists(ListNode list1, ListNode list2)
     {
         ListNode newList = new ListNode();
 
         var l1 = list1;
         var l2 = list2;
         var lNew = newList;
 
         while (l1 != null || l2 != null)
         {
             var newNode = new ListNode();
 
             if (l1 != null && l2 != null)
             {
                 if (l1.val < l2.val)
                 {
                     newNode.val = l1.val;
                     lNew.next = newNode;
                     l1 = l1.next;
                 }
                 else if (l2.val < l1.val)
                 {
                     newNode.val = l2.val;
                     lNew.next = newNode;
                     l2 = l2.next;
                 }
                 else
                 {
                     newNode.val = l1.val;
                     lNew.next = newNode;
                     lNew.next.next = new ListNode(l1.val);
                     l1 = l1.next;
                     l2 = l2.next;
                     lNew = lNew.next;
                 }
             }
             else if (l1 != null && l2 == null)
             {
                 newNode.val = l1.val;
                 lNew.next = newNode;
                 l1 = l1.next;
             }
             else
             {
                 newNode.val = l2.val;
                 lNew.next = newNode;
                 l2 = l2.next;
             }
 
             lNew = lNew.next;
         }
 
         return newList.next;
     }
 }