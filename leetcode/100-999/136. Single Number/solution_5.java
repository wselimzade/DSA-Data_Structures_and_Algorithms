class Solution
{
    public int singleNumber(int[] nums)
    {
        HashMap<Integer, Integer> numsAndCount = new HashMap<>();

        for (int n : nums)
            numsAndCount.put(n, numsAndCount.getOrDefault(n, 0) + 1);

        for (var pair : numsAndCount.entrySet())
            if (pair.getValue() == 1)
                return pair.getKey();
        
        return -1;
    }
}