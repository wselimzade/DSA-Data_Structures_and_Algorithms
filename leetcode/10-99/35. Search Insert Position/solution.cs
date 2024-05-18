public class Solution
{
    public int SearchInsert(int[] nums, int target)
    {
        int left = 0;
        int right = nums.Length - 1;

        while (left <= right)
        {
            int mid = (right - left) / 2 + left;

            if (nums[mid] == target)
                return mid;

            _ = nums[mid] > target ? right = mid - 1 : left = mid + 1;
        }

        return left;
    }
}