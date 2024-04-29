public class Solution
{
    public int LengthOfLastWord(string s)
    {
        string word = "";

        for (int i = s.Length - 1; i >= 0; --i)
        {
            if (word.Length == 0 && s[i] == ' ')
                continue;
            else
            {
                if (s[i] == ' ')
                    return word.Length;

                word += s[i];
            }
        }

        return word.Length;
    }
}