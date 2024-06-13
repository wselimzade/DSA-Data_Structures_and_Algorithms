public class Solution 
{
    public int TitleToNumber(string columnTitle) 
    {
        int title = 0;
        int power = 0;

        for (int i = columnTitle.Length - 1; i >= 0; --i)
        {
            int num = columnTitle[i] - 64;
            title += num * (int) Math.Pow(26, power++);
        }    

        return title;
    }
}