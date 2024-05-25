public class Solution
{
    public bool IsPalindrome(string s)
    {
        int left = 0;
        int right = s.Length - 1;

        while (left < right)
        {
            var leftCh = s[left];
            var rightCh = s[right];

            if (!Char.IsLetterOrDigit(leftCh))
                left++;

            if (!Char.IsLetterOrDigit(rightCh))
                right--;

            if (Char.IsLetterOrDigit(leftCh) && Char.IsLetterOrDigit(rightCh))
            {
                if (Char.ToLower(leftCh) != char.ToLower(rightCh))
                    return false;

                left++;
                right--;
            }
        }

        return true;
    }
}