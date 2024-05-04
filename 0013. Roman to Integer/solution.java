class Solution
{
    public int romanToInt(String s)
    {
        HashMap<Character, Integer> romans = new HashMap<Character, Integer>()
        {
            {
                put('I', 1); put('V', 5); put('X', 10); put('L', 50);
                put('C', 100); put('D', 500); put('M', 1000);
            }
        };

        int integer = 0;

        for (int i = s.length() - 1; i >= 0; --i)
        {
            char curr = s.charAt(i);

            if (i >= 1)
            {
                char before = s.charAt(i - 1);
                String currAndBefore = "" + before + curr;

                if (currAndBefore.equals("IV") || currAndBefore.equals("IX") ||
                        currAndBefore.equals("XL") || currAndBefore.equals("XC") ||
                        currAndBefore.equals("CD") || currAndBefore.equals("CM"))
                {
                    integer += romans.get(curr) - romans.get(before);
                    --i;
                }
                else
                {
                    integer += romans.get(curr);
                }
            }
            else
            {
                integer += romans.get(curr);
            }
        }

        return integer;
    }
}