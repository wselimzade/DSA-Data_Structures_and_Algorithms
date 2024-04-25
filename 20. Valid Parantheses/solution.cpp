class Solution 
{
    public:
        bool isValid(string s) 
        {
            string stack;

            for (int i = 0; i < size(s); ++i)
            {
                char curr = s[i];

                if (curr == ')' || curr == '}' || curr == ']')
                {
                    if (stack.empty())
                        return false;
                    else
                    {
                        switch (curr)
                        {
                            case ')':
                                if (stack.back() == '(')
                                    stack.pop_back();
                                else
                                    return false;
                                break;

                            case '}':
                                if (stack.back() == '{')
                                    stack.pop_back();
                                else
                                    return false;
                                break;

                            case ']':
                                if (stack.back() == '[')
                                    stack.pop_back();
                                else
                                    return false;
                                break;
                            
                            default:
                                break;
                        }
                    }
                }
                else
                {
                    stack.push_back(curr);
                }
            }

            return stack.empty() ? true: false;
        }
};