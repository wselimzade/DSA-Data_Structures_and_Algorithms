class Solution 
{
    public:
        int removeDuplicates(vector<int>& nums) 
        {
            int index = 1;
            for (int i = 0; i < size(nums) - 1; ++i)
            {
                if (nums[i] != nums[i + 1])
                {
                    nums[index++] = nums[i + 1];
                }
            }
            
            return index;
        }
};