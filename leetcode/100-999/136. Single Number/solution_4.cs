public class Solution
{
    public int SingleNumber(int[] nums)
    {
        HashSet<int> numbers = new HashSet<int>(nums);

        int sumComplete = 0;
        foreach (int n in numbers)
            sumComplete += n * 2;

        int sumCurrent = 0;
        foreach (int n in nums)
            sumCurrent += n;

        return sumComplete - sumCurrent;
    }
}