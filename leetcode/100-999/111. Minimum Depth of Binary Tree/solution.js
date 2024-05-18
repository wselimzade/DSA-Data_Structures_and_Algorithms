/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */

/**
 * @param {TreeNode} root
 * @return {number}
 */

var minDepth = function(root) 
{
    if (root)
    {
        let minDepth = 1
        
        let nodes = [root];

        while (nodes.length)
        {
            const newNodes = [];

            for (const node of nodes) 
            {
                if (!node.left && !node.right)
                    return minDepth

                if (node.left)
                    newNodes.push(node.left)

                if (node.right)
                    newNodes.push(node.right)
            }

            nodes = newNodes
            minDepth++
        }
    }

    return 0
};