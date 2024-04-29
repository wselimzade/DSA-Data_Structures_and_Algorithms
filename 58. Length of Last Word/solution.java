class Solution 
{
    public int lengthOfLastWord(String s) 
    {
        String word = "";
        
        for (int i = s.length() - 1; i >= 0; --i)
        {
            if (word.isEmpty() && s.charAt(i) == ' ')
                continue;
            else
            {
                if (s.charAt(i) == ' ')
                    return word.length();
                
                word += s.charAt(i);
            }
        }
        
        return word.length();
    }
}