public class Solution 
{
    public int TitleToNumber(string columnTitle) 
    {
        int title = 0;

        foreach (int letter in columnTitle)
            title = title * 26 + (letter - 64);

        return title;
    }
}