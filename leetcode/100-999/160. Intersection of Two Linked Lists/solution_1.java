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