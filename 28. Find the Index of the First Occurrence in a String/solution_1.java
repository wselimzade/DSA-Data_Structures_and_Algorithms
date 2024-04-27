class Solution
{
    public int strStr(String haystack, String needle)
    {
        if (haystack.length() < needle.length())
            return -1;

        int index = -1;

        for (int i = 0; i <= haystack.length() - needle.length(); ++i)
        {
            boolean ok = true;

            for (int j = 0; j < needle.length(); ++j)
            {
                if (haystack.charAt(i + j) != needle.charAt(j))
                {
                    ok = false;
                    break;
                }
            }

            if (ok)
            {
                index = i;
                break;
            }

        }
        
        return index;
    }
}