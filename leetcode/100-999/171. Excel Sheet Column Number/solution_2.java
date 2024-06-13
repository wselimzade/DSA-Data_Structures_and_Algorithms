class Solution 
{
    public int titleToNumber(String columnTitle) 
    {
        int title = 0;

        for (int letter : columnTitle.toCharArray())
            title = title * 26 + (letter - 64);   

        return title;
    }
}