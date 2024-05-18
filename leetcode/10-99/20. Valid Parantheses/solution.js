/**
 * @param {string} s
 * @return {boolean}
 */

var isValid = function(s) 
{
    let stack = ""
    
    for (let i = 0; i < s.length; ++i)
    {
        const curr = s[i]

        if (curr == ')' || curr == '}' || curr == ']')
        {
            if (stack.length == 0)
                return false
            else
            {
                switch (curr) {
                    case ')':
                        if (stack.charAt(stack.length - 1) == '(')
                            stack = stack.substring(0, stack.length - 1)
                        else
                            return false
                        break

                        case '}':
                            if (stack.charAt(stack.length - 1) == '{')
                                stack = stack.substring(0, stack.length - 1)
                            else
                                return false
                            break

                        case ']':
                            if (stack.charAt(stack.length - 1) == '[')
                                stack = stack.substring(0, stack.length - 1)
                            else
                                return false
                            break
            
                    default:
                        break
                }
            }
        }
        else
        {
            stack += curr;
        }

    }

    return stack.length == 0
};