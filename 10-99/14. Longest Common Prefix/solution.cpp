class Solution 
{
    public:
        string longestCommonPrefix(vector<string>& strs) 
        {
            string commonPrefix;

            sort(strs.begin(), strs.end());

            for (int i = 0; i < size(strs[0]); ++i)
            {
                char curr = strs[0][i];
                bool ok = true;

                for (int j = 0; j < size(strs); ++j)
                {
                    char next = strs[j][i];
                    
                    if (curr != next)
                    {
                        ok = false;
                        break;
                    }
                }

                if (ok)
                    commonPrefix.push_back(curr);
                else
                    break;
            }

            return commonPrefix;
        }
};