/**
 * @param {string} columnTitle
 * @return {number}
 */

var titleToNumber = function(columnTitle) 
{
    let title = 0
    let power = 0

    for (const i = columnTitle.length - 1; i >= 0; --i)
    {
        const num = columnTitle[i] - 64
        title += num * Math.pow(26, power++)
    }    

    return title
};