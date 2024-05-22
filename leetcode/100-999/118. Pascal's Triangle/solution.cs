public class Solution 
{
    public IList<IList<int>> Generate(int numRows) 
    {
        var pascalTriangle = new List<IList<int>> { new List<int> { 1 } };

        for (int i = 0; i < numRows - 1; ++i)
        {
            var nextRow = new List<int> { 1 };

            for (int j = 0; j < pascalTriangle[i].Count; ++j)
            {
                if (j == pascalTriangle[i].Count - 1)
                    nextRow.Add(1);
                else
                    nextRow.Add(pascalTriangle[i][j] + pascalTriangle[i][j + 1]);
            }

            pascalTriangle.Add(nextRow);
        }    

        return pascalTriangle;
    }
}