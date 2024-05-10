public class Solution
    {
        public bool IsValid(string s)
        {
            string stack = "";

            for (int i = 0; i < s.Length; ++i)
            {
                char curr = s[i];

                if (curr.Equals(')') || curr.Equals('}') || curr.Equals(']'))
                {
                    if (stack.Count() == 0)
                        return false;
                    else
                    {
                        switch(curr)
                        {
                            case ')':
                                if (stack.Last().Equals('('))
                                    stack = stack.Substring(0, stack.Length - 1);
                                else
                                    return false;
                                break;

                            case ']':
                                if (stack.Last().Equals('['))
                                    stack = stack.Substring(0, stack.Length - 1);
                                else
                                    return false;
                                break;

                            case '}':
                                if (stack.Last().Equals('{'))
                                    stack = stack.Substring(0, stack.Length - 1);
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
                    stack += curr;
                }
            }

            return stack.Count() > 0 ? false : true;
        }
    }