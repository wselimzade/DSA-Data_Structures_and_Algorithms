public class Solution
{
    public int SingleNumber(int[] nums)
    {
        foreach (int num in nums)
        {
            if (nums.Count(n => n == num) == 1)
                return num;
        }

        return -1;
    }
}