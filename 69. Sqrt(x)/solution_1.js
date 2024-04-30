/**
 * @param {number} x
 * @return {number}
 */


var mySqrt = function(x) 
{
    let sqrt = 0

    for (let i = 0; i <= x; ++i)
    {
        if (i * i <= x)
            sqrt = i
        else
            break
    }   

    return sqrt 
};