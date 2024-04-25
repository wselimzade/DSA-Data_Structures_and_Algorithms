class Solution 
{
    public:
        int removeDuplicates(vector<int>& nums) 
        {
            set<int> numSet(nums.begin(), nums.end());
            nums.assign(numSet.begin(), numSet.end());
            return nums.size();
        }
};