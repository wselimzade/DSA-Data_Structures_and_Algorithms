class Solution 
{
    public:
        int titleToNumber(string columnTitle) 
        {
            int title = 0;
            int power = 0;

            for (int i = columnTitle.size() - 1; i >= 0; --i)
            {
                int num = columnTitle[i] - 64;
                title += num * pow(26, power++);
            }   

            return title;
        }
};