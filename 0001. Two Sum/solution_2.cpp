class Solution 
{
    public:
        vector<int> twoSum(vector<int>& nums, int target) 
        {
            map<int, int> numsAndIndex;

            for (int i = 0; i < size(nums); ++i)
            {
                int curr = nums[i];
                int diff = target - nums[i];

                if (numsAndIndex.find(diff) != numsAndIndex.end())
                    return {numsAndIndex[diff], i};
                
                numsAndIndex[curr] = i;
            }

            return {};
        }
};