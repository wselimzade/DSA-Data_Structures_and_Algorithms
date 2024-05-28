/**
 * Definition for singly-linked list.
 * class ListNode {
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
     public boolean hasCycle(ListNode head) 
     {
         HashSet<ListNode> memoryAddress = new HashSet<>();
         
         var h = head;
         
         while (h != null)
         {
             if (!memoryAddress.contains(h))
             {
                 memoryAddress.add(h);
                 h = h.next;
             }
             else 
                 return true;
         }
         
         return false;
     }
 }