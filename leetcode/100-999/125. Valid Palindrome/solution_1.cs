public class Solution
{
    public string toLowerChars(string s)
    {
        string chars = "";

        foreach (var ch in s.ToLower())
        {
            if (char.IsLetter(ch) || char.IsDigit(ch))
                chars += ch;
        }

        return chars;
    }

    public bool IsPalindrome(string s)
    {
        string chars = toLowerChars(s);
        string reversedChars = new string(toLowerChars(s).Reverse().ToArray());

        return chars.Equals(reversedChars);
    }
}