/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */

/**
 * @param {ListNode} head
 * @return {boolean}
 */

var hasCycle = function(head) 
{
    const memoryAddress = new Set
    
    let h = head

    while (h)
    {
        if (!memoryAddress.has(h))
        {
            memoryAddress.add(h)
            h = h.next
        }
        else    
            return true
    }

    return false
};