class Solution 
{
    public:
        int singleNumber(vector<int>& nums) 
        {
            int number = 0;

            for (int num : nums)
                number ^= num;  

            return number;
        }
};