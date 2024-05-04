class Solution
{
    public String longestCommonPrefix(String[] strs)
    { 
        StringBuilder commonPrefix = new StringBuilder();
        Arrays.sort(strs);

        for (int i = 0; i < strs[0].length(); ++i)
        {
            char curr = strs[0].charAt(i);
            boolean ok = true;

            for (int j = 0; j < strs.length; ++j)
            {
                char next = strs[j].charAt(i);

                if (curr != next)
                {
                    ok = false;
                    break;
                }
            }

            if (ok)
                commonPrefix.append(curr);
            else
                break;
        }

        return commonPrefix.toString();
    }
}