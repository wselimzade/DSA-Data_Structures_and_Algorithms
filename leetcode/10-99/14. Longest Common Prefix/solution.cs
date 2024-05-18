public class Solution
    {
        public string LongestCommonPrefix(string[] strs)
        {
            string commonPrefix = "";
            Array.Sort(strs);

            for (int i = 0; i < strs[0].Length; ++i)
            {
                char curr = strs[0][i];
                bool ok = true;

                for (int j = 0; j < strs.Length; ++j)
                {
                    char next = strs[j][i];

                    if (curr != next)
                    {
                        ok = false;
                        break;
                    }
                }

                if (ok)
                    commonPrefix += curr;
                else
                    break;
            }

            return commonPrefix;
        }
    }