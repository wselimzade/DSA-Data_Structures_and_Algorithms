/**
 * 
 * @param {string} ch 
 * @returns {string} 
 */

function isLetterOrDigit(ch) 
{
    return /^[a-z0-9]$/i.test(ch);
}

/**
 * @param {string} s
 * @return {boolean}
 */

var isPalindrome = function(s) 
{
    let left = 0
    let right = s.length - 1
    
    while (left < right)
    {
        const leftCh = s[left]
        const rightCh = s[right]

        if (!isLetterOrDigit(leftCh))
            left++;

        if (!isLetterOrDigit(rightCh))
            right--;
        
        if (isLetterOrDigit(leftCh) && isLetterOrDigit(rightCh))
        {
            if (leftCh.toLowerCase() != rightCh.toLowerCase())
                return false;

            left++;
            right--;
        }
    }

    return true;
};