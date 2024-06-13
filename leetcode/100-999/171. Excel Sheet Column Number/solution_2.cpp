class Solution 
{
    public:
        int titleToNumber(string columnTitle) 
        {
            int title = 0;

            for (int letter : columnTitle) 
                title = title * 26 + (letter - 64);

            return title;
        }
};