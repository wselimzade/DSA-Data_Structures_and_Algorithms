/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */

/**
 * @param {ListNode} head
 * @return {ListNode}
 */

var deleteDuplicates = function(head) 
{
    if (head == null) return head

    const newList = new ListNode(head.val)

    let newL = newList
    while (head.next)
    {
        if (newL.val != head.next.val)
        {
            newL.next = new ListNode(head.next.val)
            newL = newL.next
        }

        head = head.next
    }

    return newList
};