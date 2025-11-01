class Solution {
    public void setZeroes(int[][] matrix) {
        List<int[]> zeroes = new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] == 0){
                    zeroes.add(new int[]{i, j}); 
                    
                }
            }
        }
        for(int []idx : zeroes){
            for(int i=0 ; i<matrix[0].length;i++){
                matrix[idx[0]][i] = 0;
            }
             for(int j=0 ; j<matrix.length;j++){
                matrix[j][idx[1]] = 0;
            }
        }
    }
}