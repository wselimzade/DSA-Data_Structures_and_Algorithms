public class Solution
{
    public int RemoveDuplicates(int[] nums)
    {
        int index = 1;
        for (int i = 0; i < nums.Length - 1; ++i)
        {
            if (nums[i] != nums[i + 1])
            {
                nums[index++] = nums[i + 1];
            }
        }

        return index;
    }
}