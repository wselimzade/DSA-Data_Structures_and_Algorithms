/**
 * @param {number} columnNumber
 * @return {string}
 */

var convertToTitle = function(columnNumber) 
{
    let title = ""

    while (columnNumber > 0)
    {
        --columnNumber;
        const remainder = columnNumber % 26
        const letter = String.fromCharCode('A'.charCodeAt(0) + remainder)

        title = letter + title

        columnNumber = Math.floor(columnNumber / 26)
    }

    return title
};