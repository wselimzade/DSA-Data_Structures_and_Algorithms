class Solution 
{
    public:
        string addBinary(string a, string b) 
        {
            int sizeA = size(a);
            int sizeB = size(b);

            if (size(a) < size(b))
                for (int i = 0; i < sizeB - sizeA; ++i)
                    a.insert(a.begin(), '0');
            else if (size(b) < size(a))
                for (int i = 0; i < sizeA - sizeB; ++i)
                    b.insert(b.begin(), '0');

            cout << "a: " << a << endl;
            cout << "b: " << b << endl;

            int indexA = a.size() - 1;
            int indexB = b.size() - 1;
            bool more = false;
            
            string sum;


            while (indexA >= 0 && indexB >= 0)
            {
                char A = a[indexA--];
                char B = b[indexB--];

                if (A == '1' && B == '1')
                {
                    if (more)
                        sum += '1';
                    else
                    {
                        sum += '0';
                        more = true;
                    }
                }
                else if (A == '0' && B == '0')
                {
                    if (more)
                    {
                        sum += '1';
                        more = false;
                    }
                    else
                        sum += '0';
                }
                else
                {
                    if (more)
                        sum += '0';
                    else
                        sum += '1';
                }
            }

            reverse(sum.begin(), sum.end());

            if (more)
                sum.insert(sum.begin(), '1');

            return sum;
        }
};