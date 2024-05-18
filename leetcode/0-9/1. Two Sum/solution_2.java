class Solution 
{
    public int[] twoSum(int[] nums, int target) 
    {
        HashMap<Integer, Integer> numAndIndex = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; ++i)
        {
            int curr = nums[i];
            int diff = target - curr;

            if (numAndIndex.containsKey(diff))
                return new int[]{numAndIndex.get(diff), i};

            numAndIndex.put(curr, i);
        }

        return new int[]{};
    }
}