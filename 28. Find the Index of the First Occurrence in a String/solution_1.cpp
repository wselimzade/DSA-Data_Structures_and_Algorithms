class Solution 
{
    public:
        int strStr(string haystack, string needle) 
        {
            int index = -1;

            for (int i = 0; i < size(haystack); ++i)
            {
                bool ok = true;
                
                for (int j = 0; j < size(needle); ++j)
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
};