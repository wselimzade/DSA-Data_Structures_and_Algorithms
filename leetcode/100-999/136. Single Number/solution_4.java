import java.util.Arrays;
import java.util.HashSet;

class Solution
{
    public int singleNumber(int[] nums)
    {
        HashSet<Integer> numbers = new HashSet<>();
        for (int num : nums)
            numbers.add(num);
        
        int sumComplete = 0;
        for (int n : numbers)
            sumComplete += n * 2;
        
        int sumCurrent = 0;
        for (int n : nums)
            sumCurrent += n;
        
        return sumComplete - sumCurrent;
    }
}