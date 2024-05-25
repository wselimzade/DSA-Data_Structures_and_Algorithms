/**
 * @param {string} s
 * @return {boolean}
 */
 
var toLowerChars = function(s)
{
    let chars = ""

    for (const ch of s.toLowerCase())
    {
        if (/[a-z0-9]/.test(ch))
            chars += ch;
    }

    return chars;
}

/**
 * @param {string} s
 * @return {boolean}
 */

var isPalindrome = function(s) 
{
    const chars = toLowerChars(s)
    const reversedChars = chars.split("").reverse().join("");

    return chars == reversedChars
};