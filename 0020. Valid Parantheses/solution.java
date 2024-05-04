class Solution
{
    public boolean isValid(String s)
    {
        StringBuilder stack = new StringBuilder();

        for (int i = 0; i < s.length(); ++i)
        {
            char curr = s.charAt(i);

            if (curr == ')' || curr == '}' || curr == ']')
            {
                if (stack.isEmpty())
                    return false;
                else
                {
                    switch (curr)
                    {
                        case ')':
                            if (stack.charAt(stack.length() - 1) == '(')
                                stack = new StringBuilder(stack.substring(0, stack.length() - 1));
                            else
                                return false;
                            break;

                        case '}':
                            if (stack.charAt(stack.length() - 1) == '{')
                                stack = new StringBuilder(stack.substring(0, stack.length() - 1));
                            else
                                return false;
                            break;

                        case ']':
                            if (stack.charAt(stack.length() - 1) == '[')
                                stack = new StringBuilder(stack.substring(0, stack.length() - 1));
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
                stack.append(curr);
            }
        }

        return stack.isEmpty();
    }
}