class Solution 
{
    public int majorityElement(int[] nums) 
    {
        int majority = -1;
        Map<Integer, Integer> numAndCount = new HashMap<>();

        for (int i = 0; i < nums.length; ++i)
        {
            numAndCount.put(nums[i], numAndCount.getOrDefault(nums[i], 0) + 1);

            if (numAndCount.get(nums[i]) > nums.length / 2)
            {
                majority = nums[i];
                break;
            }
        }

        return majority;
    }
}