class Solution 
{
    public int titleToNumber(String columnTitle) 
    {
        int title = 0;
        int power = 0;

        for (int i = columnTitle.length() - 1; i >= 0; --i)
        {
            int num = columnTitle.charAt(i) - 64;
            title += num * Math.pow(26, power++);
        }    

        return title;
    }
}