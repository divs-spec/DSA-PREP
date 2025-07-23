import java.util.*;
class Solution {
    public void setZeroes(int[][] matrix) {
        HashMap<Integer, Boolean> ht1 = new HashMap<>();
        HashMap<Integer, Boolean> ht2 = new HashMap<>();
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(matrix[i][j] == 0)
                {
                    ht1.put(i,true);
                    ht2.put(j,true);
                }
            }
        }
        for(Integer row : ht1.keySet())
        {
            for(int i = 0; i < n; i++){
                matrix[row][i] = 0;
            }
        }
        for(Integer col : ht2.keySet())
        {
            for(int i = 0; i < m; i++){
                matrix[i][col] = 0;
            }
        }
    }
}
