var lengthOfLastWord = function(s) 
{
    let word = ""

    for (let i = s.length - 1; i >= 0; --i)
    {
        if (word.length == 0 && s[i] == ' ')
            continue
        else
        {
            if (s[i] == ' ')
                return word.length

            word += s[i]
        }
    }    

    return word.length
};