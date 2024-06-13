/**
 * @param {string} columnTitle
 * @return {number}
 */

var titleToNumber = function(columnTitle) 
{
    let title = 0
    
    for (const letter of columnTitle)
        title = title * 26 + (letter.charCodeAt() - 64);   

    return title
};