class Solution 
{
    public:
        string toLowerLetters(string s)
        {
            string chars;

            for (auto ch : s)
            {
                if (isalpha(ch) || isdigit(ch))
                    letters += tolower(ch);
            }

            return chars;
        }

        bool isPalindrome(string s) 
        {
            string letters = toLowerLetters(s);
            string reversedLetters = toLowerLetters(s);
            
            reverse(reversedLetters.begin(), reversedLetters.end());

            return reversedLetters == letters;
        }
};