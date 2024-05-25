public class Solution
{
    public int SingleNumber(int[] nums)
    {
        Array.Sort(nums);

        for (int i = 0; i < nums.Length; i += 2)
        {
            if (i == nums.Length - 1)
                return nums[i];

            if (nums[i] != nums[i + 1])
                return nums[i];
        }

        return -1;
    }
}