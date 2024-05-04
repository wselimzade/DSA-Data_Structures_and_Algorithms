public class Solution
{
    public int MySqrt(int x)
    {
        int low = 0;
        int high = x;

        while (low <= high)
        {
            long mid = (high - low) / 2 + low;

            if (mid * mid == x)
                return (int) mid;

            if (mid * mid > x)
                high = (int)(mid - 1);
            else if (mid * mid < x)
                low = (int)(mid + 1);
        }

        return low - 1;
    }
}