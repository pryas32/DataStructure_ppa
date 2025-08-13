class NumMatrix {
private:
    vector<vector<int>> matrix; // here we haev decalred private variable accessible within class 

public:
    NumMatrix(vector<vector<int>>& mat) {
        matrix = mat;

        int n = matrix.size();
        int m = matrix[0].size();

     
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < m; j++) {
                matrix[i][j] += matrix[i][j - 1];
            }
        }

       
        for (int j = 0; j < m; j++) {
            for (int i = 1; i < n; i++) {
                matrix[i][j] += matrix[i - 1][j];
            }
        }
    }

    int sumRegion(int row1, int col1, int row2, int col2) {
        int sum =0;
        sum+= matrix[row2][col2];

        if (row1-1 >= 0)
            sum -= matrix[row1 - 1][col2];

        if (col1-1 >=0)
            sum -= matrix[row2][col1 - 1];

        if (row1-1 >= 0 && col1-1 >= 0)
            sum += matrix[row1 - 1][col1 - 1];

        return sum;
    }
};
