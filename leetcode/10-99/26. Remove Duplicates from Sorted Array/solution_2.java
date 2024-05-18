class Solution
{
    public int removeDuplicates(int[] nums)
    {
        Set<Integer> numSet = new LinkedHashSet<>();

        for (int num : nums)
            numSet.add(num);

        int i = 0;
        for (int num : numSet)
            nums[i++] = num;

        return numSet.size();
    }
}