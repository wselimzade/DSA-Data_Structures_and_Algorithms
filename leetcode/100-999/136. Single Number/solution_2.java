class Solution
{
    public int singleNumber(int[] nums)
    {
        for (int num : nums)
        {
            if (Arrays.stream(nums).filter(n -> n == num).count() == 1)
                return num;
        }
        
        return -1;
    }
}