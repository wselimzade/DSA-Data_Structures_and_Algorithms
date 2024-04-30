/**
 * @param {string} s
 * @return {number}
 */

var romanToInt = function(s) 
{
    let romans = new Map([
        ['I', 1], ['V', 5], ['X', 10], ['L', 50], ['C', 100],
        ['D', 500], ['M', 1000]
    ])

    let integer = 0

    for (let i = s.length - 1; i >= 0; --i)
    {
        const curr = s[i]

        if (i >= 1)
        {
            const before = s[i - 1]
            const currAndBefore = before + curr

            if (currAndBefore == "IV" || currAndBefore == "IX" ||
                currAndBefore == "XL" || currAndBefore == "XC" ||
                currAndBefore == "CD" || currAndBefore == "CM")
            {
                integer += romans.get(curr) - romans.get(before)
                --i
            }
            else
            {
                integer += romans.get(curr);
            }
        }
        else
        {
            integer += romans.get(curr);
        }
    }

    return integer
};