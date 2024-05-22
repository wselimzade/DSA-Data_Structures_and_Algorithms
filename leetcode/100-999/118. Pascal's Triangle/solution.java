class Solution
{
    public List<List<Integer>> generate(int numRows)
    {
        var pascalTriangle = new ArrayList<List<Integer>>();
        var firstRow = new ArrayList<Integer>();

        firstRow.add(1);
        pascalTriangle.add(firstRow);

        for (int i = 0; i < numRows - 1; ++i)
        {
            var nextRow = new ArrayList<Integer>();
            nextRow.add(1);

            for (int j = 0; j < pascalTriangle.get(i).size(); ++j)
            {
                if (j == pascalTriangle.get(i).size() - 1)
                    nextRow.add(1);
                else
                    nextRow.add(pascalTriangle.get(i).get(j) + pascalTriangle.get(i).get(j + 1));
            }

            pascalTriangle.add(nextRow);
        }

        return pascalTriangle;
    }
}