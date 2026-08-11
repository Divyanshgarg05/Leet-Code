class NumMatrix {

    int[][] pSum;
    int[][] matrix;

    public void getPSum(int[][] matrix){
        pSum[0][0] = matrix[0][0];
        for(int i=1;i<matrix[0].length;i++){
            pSum[0][i] = pSum[0][i-1] + matrix[0][i];
        }
        for(int j=1;j<matrix.length;j++){
            pSum[j][0] = pSum[j-1][0] + matrix[j][0];
        }

        for(int i=1;i<matrix.length;i++){
            for(int j=1;j<matrix[0].length;j++){
                pSum[i][j] = pSum[i-1][j] + pSum[i][j-1] - pSum[i-1][j-1] + matrix[i][j];
            }
        }
    }

    public int getValue(int row,int col){
        if(row<0 || col<0){
            return 0;
        }
        return pSum[row][col];
    }

    public NumMatrix(int[][] matrix) {
        this.matrix = matrix;
        pSum = new int[matrix.length][matrix[0].length];
        getPSum(matrix);
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        //Total Sum
        int total = getValue(row2,col2);
        //top
        int top = getValue(row1-1,col2);

        //left
        int left = getValue(row2,col1-1);

        //overlap
        int overlap = getValue(row1-1,col1-1);

        return total - top - left + overlap;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */