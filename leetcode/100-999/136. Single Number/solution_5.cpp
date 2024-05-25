class Solution 
{
    public:
        int singleNumber(vector<int>& nums) 
        {
            map<int, int> numsAndCount;

            for (int n : nums)
                numsAndCount[n]++;

            for (auto pair : numsAndCount)
                if (pair.second == 1)
                    return pair.first;

            return -1;
        }
};