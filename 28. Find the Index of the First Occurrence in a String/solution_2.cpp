class Solution 
{
    public:
        int strStr(string haystack, string needle) 
        {
            if (size(haystack) < size(needle))
                return -1;
                
            for (int i = 0; i <= size(haystack) - size(needle); ++i)
            {
                if (haystack.substr(i, size(needle)) == needle)
                {
                    return i;
                }
            }   
            return -1;
        }
};