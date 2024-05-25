class Solution
{
    public String toLowerChars(String s)
    {
        String chars = "";

        for (char ch : s.toLowerCase().toCharArray())
        {
            if (Character.isAlphabetic(ch) || Character.isDigit(ch))
                chars += ch;
        }

        return chars;
    }

    public boolean isPalindrome(String s)
    {
        String chars = toLowerChars(s);
        String reversedChars = new StringBuilder(toLowerChars(s)).reverse().toString();

        return chars.equals(reversedChars);
    }
}
