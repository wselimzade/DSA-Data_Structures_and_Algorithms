public class Solution
{
    public int SingleNumber(int[] nums)
    {
        Dictionary<int, int> numsAndCount = new Dictionary<int, int>();

        foreach (int n in nums)
            if (numsAndCount.ContainsKey(n))
                numsAndCount[n]++;
            else
                numsAndCount[n] = 1;

        foreach (var pair in numsAndCount)
            if (pair.Value == 1)
                return pair.Key;

        return -1;
    }
}
