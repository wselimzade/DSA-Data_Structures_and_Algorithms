public class Solution {
    public int[] TwoSum(int[] nums, int target)
    {
        Dictionary<int, int> numAndIndex = new Dictionary<int, int>();

        for (int i = 0; i < nums.Length; ++i)
        {
            int curr = nums[i];
            int diff = target - curr;

            if (numAndIndex.ContainsKey(diff))
                return new int[] { numAndIndex[diff], i };

            numAndIndex[curr] = i;
        }

        return new int[] { };
    }
}