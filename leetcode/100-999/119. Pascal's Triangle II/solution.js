/**
 * @param {number} rowIndex
 * @return {number[]}
 */

var getRow = function(rowIndex) 
{
    const pascalTriangle = [[1]];
    
    for (let i = 1; i <= rowIndex; ++i)
    {
        const nextRow = [1];

        for (let j = 1; j < i; ++j)
        {
            nextRow.push(pascalTriangle[i - 1][j - 1] + pascalTriangle[i - 1][j]);
        }

        nextRow.push(1);
        pascalTriangle.push(nextRow);
    }

    return pascalTriangle[rowIndex];
};