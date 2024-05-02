public class Solution
{
    public void Merge(int[] nums1, int m, int[] nums2, int n)
    {
        int j = 0;
        for (int i = m; i < m + n; ++i)
        {
            nums1[i] = nums2[j++];
        }

        Array.Sort(nums1);
    }
}