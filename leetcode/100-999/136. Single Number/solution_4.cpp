class Solution 
{
    public:
        int singleNumber(vector<int>& nums) 
        {
            set<int> numbers(nums.begin(), nums.end());

            int sumComplete = 0;
            for (int n : numbers)
                sumComplete += n * 2;

            int sumCurrent = 0;
            for (int n : nums)
                sumCurrent += n;

            return sumComplete - sumCurrent;
        }
};