var longestCommonPrefix = function(strs) 
{
    let commonPrefix = "";
    strs.sort();
    
    for (let i = 0; i < strs[0].length; ++i)
    {
        const curr = strs[0][i];
        let ok = true;

        for (let j = 0; j < strs.length; ++j)
        {
            const next = strs[j][i];

            if (curr != next)
            {
                ok = false;
                break;
            }
        }

        if (ok)
            commonPrefix += curr;
        else
            break;
    }

    return commonPrefix;
};