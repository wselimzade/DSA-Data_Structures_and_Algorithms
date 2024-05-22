class Solution
{
    public List<Integer> getRow(int rowIndex)
    {
        var pascalTriangle = new ArrayList<List<Integer>>();
        var firstRow = new ArrayList<Integer>();

        firstRow.add(1);
        pascalTriangle.add(firstRow);

        for (int i = 1; i <= rowIndex; ++i)
        {
            var nextRow = new ArrayList<Integer>(i + 1);
            nextRow.add(1);

            for (int j = 1; j < i; ++j)
            {
                nextRow.add(pascalTriangle.get(i - 1).get(j - 1) + pascalTriangle.get(i - 1).get(j));
            }

            nextRow.add(1);
            pascalTriangle.add(nextRow);
        }

        return pascalTriangle.get(rowIndex);
    }
}