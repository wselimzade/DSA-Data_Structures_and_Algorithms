class Solution 
{
    public:
        int removeElement(vector<int>& nums, int val) 
        {
            vector<int> newNums;
            int find = 0;

            for (int n : nums)
                if (n != val) newNums.push_back(n);
                else find++;

            nums.assign(newNums.begin(), newNums.end());

            for (int i = 0; i < find; ++i)
                nums.push_back(val);

            return size(nums) - find;
        }
};