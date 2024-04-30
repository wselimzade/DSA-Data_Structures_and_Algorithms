public class Solution
{
    public string AddBinary(string a, string b)
    {
        int sizeA = a.Length;
        int sizeB = b.Length;

        if (sizeB > sizeA)
            for (int i = 0; i < sizeB - sizeA; ++i)
                a = "0" + a;
        else if (sizeA > sizeB)
            for (int i = 0; i < sizeA - sizeB; ++i)
                b = "0" + b;

        int indexA = a.Length - 1;
        int indexB = b.Length - 1;
        bool more = false;

        string sum = "";

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

        string SUM = new string(sum.Reverse().ToArray());

        if (more)
            SUM = "1" + SUM;

        return SUM;
    }
}