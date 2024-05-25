class Solution
{
public:
    bool isPalindrome(string s)
    {
        int left = 0;
        int right = s.size() - 1;

        while (left < right)
        {
            auto leftCh = s[left];
            auto rightCh = s[right];

            if (!isalnum(leftCh))
                left++;

            if (!isalnum(rightCh))
                right--;

            if (isalnum(leftCh) && isalnum(rightCh))
            {
                if (tolower(leftCh) != tolower(rightCh))
                    return false;

                left++;
                right--;
            }

            return true;
        }
    };