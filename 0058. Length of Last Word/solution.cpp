class Solution 
{
    public:
        int lengthOfLastWord(string s) 
        {
            string word = "";

            for (int i = size(s) - 1; i >= 0; --i)
            {
                if (word.empty() && s[i] == ' ')
                    continue;
                else
                {
                    if (s[i] == ' ')
                        return word.size();
                    
                    word.push_back(s[i]);
                }
            }

            return word.size();
        }
};