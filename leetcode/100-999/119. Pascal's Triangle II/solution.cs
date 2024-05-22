public class Solution 
{
    public IList<int> GetRow(int rowIndex) 
    {
        var pascalTriangle = new List<IList<int>> { new List<int> { 1 } };

        for (int i = 1; i <= rowIndex; ++i)
        {
            var nextRow = new List<int>(new int[i + 1]);

            nextRow[0] = 1; 
            nextRow[i] = 1;

            for (int j = 1; j < i; ++j)
            {
                nextRow[j] = pascalTriangle[i - 1][j - 1] + pascalTriangle[i - 1][j];
            }

            pascalTriangle.Add(nextRow);
        }    

        return pascalTriangle[rowIndex];
    }
}