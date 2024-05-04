public class Solution
{
    public int MySqrt(int x)
    {
        long sqrt = 0;

        for (long i = 0; i <= x; ++i)
        {
            if (i * i <= x)
                sqrt = i;
            else
                break;
        }

        return (int)sqrt;
    }
}