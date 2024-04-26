class Solution 
{
    public int removeElement(int[] nums, int val) 
    {
        List<Integer> newNums = new ArrayList<>();
        int find = 0;
        
        for (int n : nums)
            if (n != val) newNums.add(n);
            else find++;
            
        for (int i = 0; i < newNums.size(); ++i)
            nums[i] = newNums.get(i);
        
        return nums.length - find;
    }
}