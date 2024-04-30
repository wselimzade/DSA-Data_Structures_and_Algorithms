/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */

/**
 * @param {ListNode} list1
 * @param {ListNode} list2
 * @return {ListNode}
 */

var mergeTwoLists = function(list1, list2) 
{
    const newList = new ListNode()

    let l1 = list1
    let l2 = list2
    let lNew = newList

    while (l1 || l2)
    {
        const newNode = new ListNode()

        if (l1 && l2)
        {
            if (l1.val < l2.val)
            {
                newNode.val = l1.val
                lNew.next = newNode
                l1 = l1.next
            }
            else if (l2.val < l1.val)
            {
                newNode.val = l2.val
                lNew.next = newNode
                l2 = l2.next
            }
            else
            {
                newNode.val = l1.val
                lNew.next = newNode
                lNew.next.next = new ListNode(l1.val)
                l1 = l1.next
                l2 = l2.next

                lNew = lNew.next
            }
        }
        else if (l1 && l2 == null)
        {
            newNode.val = l1.val
            lNew.next = newNode
            l1 = l1.next
        }
        else
        {
            newNode.val = l2.val
            lNew.next = newNode
            l2 = l2.next
        }

        lNew = lNew.next
    }

    return newList.next;
};