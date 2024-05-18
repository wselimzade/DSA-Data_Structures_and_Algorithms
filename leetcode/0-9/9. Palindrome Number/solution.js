/**
 * @param {number} x
 * @return {boolean}
 */

var isPalindrome = function(x) 
{
    if (x < 0 || (x != 0 && x % 10 == 0))
        return false;

    let revX = 0;
    while (revX < x)
    {
        let tail = x % 10;
        revX = revX * 10 + tail;

        x = Math.floor(x / 10);
    }
    
    return revX == x || Math.floor(revX / 10) == x;
};