class Solution {
    public:
        int mySqrt(int x) 
        {
            long int sqrt = 1;

            for (long int i = 0; i <= x; ++i)
            {
                if (i * i <= x)
                    sqrt = i;
                else
                    break;
            }

            return sqrt;
        }
};