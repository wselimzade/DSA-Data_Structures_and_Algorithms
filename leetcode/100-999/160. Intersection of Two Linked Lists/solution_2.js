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
    const nodes = []
    let node = null
    
    node = headA
    while (node)
    {
        nodes.push(node)
        node = node.next
    }

    node = headB
    while (node)
    {
        if (nodes.includes(node))
            return node

        node = node.next
    }

    return null
};