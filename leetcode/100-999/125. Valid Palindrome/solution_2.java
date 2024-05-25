class Solution
{
    public boolean isPalindrome(String s)
    {
        int left = 0;
        int right = s.length() - 1;

        while (left < right)
        {
            var leftCh = s.charAt(left);
            var rightCh = s.charAt(right);

            if (!Character.isLetterOrDigit(leftCh))
                left++;

            if (!Character.isLetterOrDigit(rightCh))
                right--;

            if (Character.isLetterOrDigit(leftCh) && Character.isLetterOrDigit(rightCh))
            {
                if (Character.toLowerCase(leftCh) != Character.toLowerCase(rightCh))
                    return false;
                
                left++;
                right--;
            }
        }
        
        return true;
    }
}