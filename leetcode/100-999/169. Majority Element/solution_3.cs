public class Solution 
{
    public int MajorityElement(int[] nums) 
    {
        int majority = -111;
        int count = 0;

        foreach (int num in nums)
        {
            if (count == 0)
                majority = num;

            count += majority == num ? 1: -1;
        }

        return majority;
    }
}