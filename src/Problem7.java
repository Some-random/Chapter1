/**
 * Created by dongweij on 2015/8/12.
 */
public class Problem7 {
    public static void setZeroes(int[][] matrix) {
        if(matrix.length == 0) {
            return;
        }
        int i, j;
        boolean zeroColumn = false, zeroRow = false;
        for(i = 0; i < matrix.length; i++) {
            if(matrix[i][0] == 0) {
                zeroColumn = true;
            }
        }
        for(i = 0; i < matrix[0].length; i++) {
            if(matrix[0][i] == 0) {
                zeroRow = true;
            }
        }
        for(i = 1; i < matrix.length; i++) {
            for(j = 1; j < matrix[0].length; j++) {
                if(matrix[i][j] == 0) {
                    matrix[i][0] = matrix[0][j] = 0;
                }
            }
        }
        for(i = 1; i < matrix.length; i++) {
            if(matrix[i][0] == 0) {
                for(j = 1; j < matrix[0].length; j++) {
                    matrix[i][j] = 0;
                }
            }
        }
        for(i = 1; i < matrix[0].length; i++) {
            if(matrix[0][i] == 0) {
                for(j = 1; j < matrix.length; j++) {
                    matrix[j][i] = 0;
                }
            }
        }
        if(zeroColumn) {
            for(i = 0; i < matrix.length; i++) {
                matrix[i][0] = 0;
            }
        }
        if(zeroRow) {
            for(i = 0; i < matrix[0].length; i++) {
                matrix[0][i] = 0;
            }
        }
    }

    //This algorithm only uses O(1) space. Pay attention to the ordering of different blocks of code
    public static void main(String args[]) {
        int[][] matrix = {{0,0,0,5},{4,3,1,4},{0,1,1,4},{1,2,1,3},{0,0,1,1}};
        setZeroes(matrix);
    }
}
