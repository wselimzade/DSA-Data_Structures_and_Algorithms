public class Solution
{
    public int ClimbStairs(int n)
    {
        int currN = 1;

        int tempVariant = 1;
        int currVariant = 1;

        while (currN < n)
        {
            int temp = currVariant;
            currVariant += tempVariant;
            tempVariant = temp;
            currN++;
        }

        return currVariant;
    }
}