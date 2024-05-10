/**
 * @param {number} n
 * @return {number}
 */
var climbStairs = function(n) 
{
    let currN = 1

    let tempVariant = 1
    let currVariant = 1

    while (currN < n)
    {
        const temp = currVariant
        currVariant += tempVariant
        tempVariant = temp
        currN++
    }    

    return currVariant
};