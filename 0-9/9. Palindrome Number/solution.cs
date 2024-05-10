public class Solution
    {
        public bool IsPalindrome(int x)
        {
            if (x < 0 || (x != 0 && x % 10 == 0))
                return false;

            int revX = 0;
            while (revX < x)
            {
                int tail = x % 10;
                revX = revX * 10 + tail;

                x /= 10;
            }

            return revX == x || revX / 10 == x;
        }
    }