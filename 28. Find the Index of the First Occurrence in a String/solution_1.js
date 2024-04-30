/**
 * @param {string} haystack
 * @param {string} needle
 * @return {number}
 */

var strStr = function(haystack, needle) 
{
    let index = -1;
    
    for (let i = 0; i < haystack.length; ++i)
    {
        let ok = true;

        for (let j = 0; j < needle.length; ++j)
        {
            if (haystack[i + j] != needle[j])
            {
                ok = false;
                break;
            }
        }

        if (ok)
        {
            index = i;
            break;
        }
    }

    return index;
};