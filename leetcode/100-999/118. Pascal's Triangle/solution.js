/**
 * @param {number} numRows
 * @return {number[][]}
 */

var generate = function(numRows) 
{
    const pascalTriangle = [[1]];
    
    for (let i = 0; i < numRows - 1; ++i)
    {
        const nextRow = [1];

        for (let j = 0; j < pascalTriangle[i].length; ++j)
        {
            if (j == pascalTriangle[i].length - 1)
                nextRow.push(1);
            else
                nextRow.push(pascalTriangle[i][j] + pascalTriangle[i][j + 1]);
        }

        pascalTriangle.push(nextRow);
    }

    return pascalTriangle;
};