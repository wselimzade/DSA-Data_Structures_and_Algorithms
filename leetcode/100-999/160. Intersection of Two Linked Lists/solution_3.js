/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */

 /**
  * @param {ListNode} head
  * @return {number}
  */

 function getLength(head)
 {
     let length = 0
 
     while (head)
     {
         head = head.next
         length++
     }
 
     return length
 }
 
 /**
  * @param {ListNode} headA
  * @param {ListNode} headB
  * @return {ListNode}
  */
 
 var getIntersectionNode = function(headA, headB) 
 {
     let A = headA
     let B = headB
 
     let lenA = getLength(A)
     let lenB = getLength(B)
 
     while (lenA > lenB)
     {
         A = A.next
         lenA--
     }
 
     while (lenB > lenA)
     {
         B = B.next
         lenB--
     }
 
     while (A != B)
     {
         A = A.next
         B = B.next
     }
 
     return A
 };