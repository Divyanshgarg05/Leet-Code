class Solution {
    public void setZeroes(int[][] matrix) {
        ArrayList<int[]> zeroes = new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] == 0){
                    zeroes.add(new int[]{i,j});
                }
            }
        }
        for(int[] idx : zeroes){
            for(int i=0;i<matrix.length;i++){
                matrix[i][idx[1]] = 0;
            }
            for(int j=0;j<matrix[0].length;j++){
                matrix[idx[0]][j] = 0;
            }
        }
    }
}