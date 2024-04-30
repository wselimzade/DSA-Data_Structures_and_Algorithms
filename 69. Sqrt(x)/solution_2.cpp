class Solution {
    public:
        int mySqrt(int x) 
        {
            int low = 0;
            int high = x;

            while (low <= high)
            {
                long int mid = (high - low) / 2 + low;

                if (mid * mid == x)
                    return mid;
                
                if (mid * mid > x)
                    high = mid - 1;
                else if (mid * mid < x)
                    low = mid + 1;
            }

            return low - 1;
        }
};