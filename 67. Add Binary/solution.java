class Solution 
{
    public String addBinary(String a, String b) 
    {
        int sizeA = a.length();
        int sizeB = b.length();
        
        if (sizeA > sizeB)
            for (int i = 0; i < sizeA - sizeB; ++i)
                b = '0' + b;
        else if (sizeB > sizeA)
            for (int i = 0; i < sizeB - sizeA; ++i)
                a = '0' + a;
            
        int indexA = a.length() - 1;
        int indexB = b.length() - 1;
        boolean more = false;
        
        StringBuilder sum = new StringBuilder();
        
        while (indexA >= 0 && indexB >= 0)
        {
            char A = a.charAt(indexA--);
            char B = b.charAt(indexB--);
            
            if (A == '1' && B == '1')
            {
                if (more)
                {
                    sum.append('1');
                }
                else
                {
                    sum.append('0');
                    more = true;
                }
            }
            else if (A == '0' && B == '0')
            {
                if (more)
                {
                    sum.append('1');
                    more = false;
                }
                else 
                    sum.append('0');
            }
            else
            {
                if (more)
                    sum.append('0');
                else 
                    sum.append('1');
            }
        }
        
        sum.reverse();
        
        if (more)
            sum.insert(0,'1');
        
        return sum.toString();
    }
}