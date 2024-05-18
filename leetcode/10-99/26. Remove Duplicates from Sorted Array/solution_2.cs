public class Solution
{
    public int RemoveDuplicates(int[] nums)
    {
        HashSet<int> numSet = new HashSet<int>(nums);
        List<int> newNums = new List<int>(numSet);
        Array.Copy(newNums.ToArray(), nums, newNums.Count);
        return newNums.Count;
    }
}