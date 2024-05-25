public class Solution
{
    public int SingleNumber(int[] nums)
    {
        int number = 0;

        foreach (int num in nums)
            number ^= num;

        return number;
    }
}