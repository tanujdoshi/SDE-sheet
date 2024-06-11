class Solution {
    public void setZeroes(int[][] matrix) {
        int raws[] = new int[matrix.length];
        int cols[] = new int[matrix[0].length];
        Arrays.fill(raws, -1);
        Arrays.fill(cols, -1);
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j] == 0){
                    raws[i] = 0;
                    cols[j] = 0;
                }
            }
        }
        
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(raws[i] == 0  || cols[j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }
        
        for(int i=0;i<matrix.length;i++){
            System.out.println(raws[i]);
        }
        System.out.println("dd");
        for(int i=0;i<cols.length;i++){
            System.out.println(cols[i]);
        }

    }
}