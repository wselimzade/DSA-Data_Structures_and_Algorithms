public class Solution
{
    public int StrStr(string haystack, string needle)
    {
        if (haystack.Length < needle.Length)
            return -1;

        int index = -1;

        for (int i = 0; i < haystack.Length; ++i)
        {
            bool ok = true;

            for (int j = 0; j < needle.Length; ++j)
            {
                if (haystack[i + j] != needle[j])
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