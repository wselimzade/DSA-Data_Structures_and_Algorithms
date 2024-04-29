public class Solution
{
    public int[] PlusOne(int[] digits)
    {
        for (int i = digits.Length - 1; i >= 0; --i)
        {
            if (digits[i] < 9)
            {
                digits[i]++;
                return digits;
            }
            else
            {
                digits[i] = 0;
            }
        }

        List<int> newDigits = new List<int>(digits);
        newDigits.Insert(0, 1);

        return newDigits.ToArray();
    }
}