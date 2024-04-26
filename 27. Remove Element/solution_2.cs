public class Solution
{
    public int RemoveElement(int[] nums, int val)
    {
        List<int> newNums = new List<int>();
        int find = 0;

        foreach (int n in nums)
            if (n != val) newNums.Add(n);
            else find++;

        for (int i = 0; i < newNums.Count; ++i)
            nums[i] = newNums[i];

        return nums.Length - find;
    }
}