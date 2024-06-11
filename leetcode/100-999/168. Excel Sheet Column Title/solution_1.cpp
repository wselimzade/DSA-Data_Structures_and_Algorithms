class Solution 
{
    public:
        string convertToTitle(int columnNumber) 
        {
            string title;

            while (columnNumber > 0)
            {
                --columnNumber;
                int remainder = columnNumber % 26;
                char letter = 'A' + remainder;
                
                title = letter + title;

                columnNumber /= 26;
            }
            
            return title;
        }
};