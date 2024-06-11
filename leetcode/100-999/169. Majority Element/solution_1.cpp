class Solution 
{
    public:
        int majorityElement(vector<int>& nums) 
        {
            int majority;
            map<int, int> numAndCount;

            for (int i = 0; i < size(nums); ++i)
            {
                numAndCount[nums[i]]++;

                if (numAndCount[nums[i]] > nums.size() / 2)
                {
                    majority = nums[i];
                    break;
                }
            }

            return majority;
        }
};