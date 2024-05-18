public class Solution
    {
        public int RomanToInt(string s)
        {
            Dictionary<char, int> romans = new Dictionary<char, int>()
            {
                { 'I', 1 }, { 'V', 5 }, { 'X', 10}, { 'L', 50}, { 'C', 100},
                { 'D', 500 }, { 'M', 1000}
            };

            int integer = 0;

            for (int i = s.Length - 1; i >= 0; --i)
            {
                char curr = s[i];

                if (i >= 1)
                {
                    char before = s[i - 1];
                    string currAndBefore = before.ToString() + curr.ToString();

                    if (currAndBefore == "IV" || currAndBefore == "IX" ||
                        currAndBefore == "XL" || currAndBefore == "XC" ||
                        currAndBefore == "CD" || currAndBefore == "CM")
                    {
                        integer += romans[curr] - romans[before];
                        --i;
                    }
                    else
                    {
                        integer += romans[curr];
                    }
                }
                else
                {
                    integer += romans[curr];
                }
            }

            return integer;
        }
    }