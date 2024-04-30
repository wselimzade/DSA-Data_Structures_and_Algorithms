/**
 * @param {number} x
 * @return {number}
 */

var mySqrt = function(x) 
{
    let low = 0
    let high = x

    while (low <= high)
    {
        let mid = Math.floor((high - low) / 2) + low

        if (mid * mid == x)
            return mid

        if (mid * mid > x)
            high = mid - 1
        else if (mid * mid < x)
            low = mid + 1
    }

    return low - 1
};