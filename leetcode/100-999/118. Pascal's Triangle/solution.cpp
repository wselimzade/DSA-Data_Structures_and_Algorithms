class Solution 
{
    public:
        vector<vector<int>> generate(int numRows) 
        {
            vector<vector<int>> pascalTriangle = {{1}};

            for (int i = 0; i < numRows - 1; ++i)
            {
                vector<int> nextRow = {1};
                
                for (int j = 0; j < pascalTriangle[i].size(); ++j)
                {
                    if (j == pascalTriangle[i].size() - 1)
                        nextRow.push_back(1);
                    else
                        nextRow.push_back(pascalTriangle[i][j] + pascalTriangle[i][j + 1]);
                }

                pascalTriangle.push_back(nextRow);
            }  

            return pascalTriangle;  
        }
};