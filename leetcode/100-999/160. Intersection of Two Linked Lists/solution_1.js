/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */

/**
 * @param {ListNode} headA
 * @param {ListNode} headB
 * @return {ListNode}
 */

var getIntersectionNode = function(headA, headB) 
{
    let A = headA
    let B = headB

    while (A && B)
    {
        if (A == B)
        {
            return A
        }
        else
        {
            if (A.next == null)
            {
                A = headA
                B = B.next
            }
            else
                A = A.next     
        }
    }

    return null
};