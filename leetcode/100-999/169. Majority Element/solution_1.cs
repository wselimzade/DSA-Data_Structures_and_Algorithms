public class Solution 
{
    public int MajorityElement(int[] nums) 
    {
        int majority = -1;
        Dictionary<int, int> numAndCount = new Dictionary<int, int>();

        for (int i = 0; i < nums.Length; ++i)
        {
            if (numAndCount.ContainsKey(nums[i]))
                numAndCount[nums[i]]++;
            else
                numAndCount[nums[i]] = 1;

            if (numAndCount[nums[i]] > nums.Length / 2)
            {
                majority = numsAndCount[nums[i]];
                break;
            }
        }

        return majority;
    }
}