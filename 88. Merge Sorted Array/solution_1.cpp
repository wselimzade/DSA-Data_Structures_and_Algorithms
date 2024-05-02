class Solution
{
    public:
        void myInsert(int index, vector<int> &nums, int add)
        {
            int temp = nums[index];
            nums[index] = add;

            for (int i = size(nums) - 1; i >= index + 1; --i)
            {
                if (i == index + 1)
                {
                    nums[i] = temp;
                    break;
                }

                nums[i] = nums[i - 1]; 
            }
        }

        void merge(vector<int> &nums1, int m, vector<int> &nums2, int n)
        {
            for (int i = 0; i < n; ++i)
            {
                int add = nums2[i];

                for (int j = 0; j < m + n; ++j)
                {
                    int curr = nums1[j];

                    if (add < curr || (curr == 0 && j >= m + i) || add == curr)
                    {
                        myInsert(j, nums1, add);
                        break;
                    }
                }
            }
        }
};