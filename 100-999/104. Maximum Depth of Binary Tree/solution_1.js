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

var maxDepth = function(root) 
{
    let depth = 0
    
    if (root)
    {
        let nodes = [root]

        while (nodes.length > 0)
        {
            let nextNodes = []

            for (const node of nodes) 
            {
                if (node.left)
                    nextNodes.push(node.left)
                
                if (node.right)
                    nextNodes.push(node.right)
            }

            nodes = nextNodes

            depth++;
        }
    }

    return depth
};