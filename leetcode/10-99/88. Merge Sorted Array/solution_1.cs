public class Solution
{
    public void MyInsert(int index, int[] nums, int add)
    {
        int temp = nums[index];
        nums[index] = add;

        for (int i = nums.Length - 1; i >= index + 1; --i)
        {
            if (i == index + 1)
            {
                nums[i] = temp;
                break;
            }

            nums[i] = nums[i - 1];
        }
    }

    public void Merge(int[] nums1, int m, int[] nums2, int n)
    {
        for (int i = 0; i < n; ++i)
        {
            int add = nums2[i];

            for (int j = 0; j < m + n; ++j)
            {
                int curr = nums1[j];

                if (add < curr || (curr == 0 && j >= m + i) || add == curr)
                {
                    MyInsert(j, nums1, add);
                    break;
                }
            }
        }
    }
}