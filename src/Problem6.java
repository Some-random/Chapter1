/**
 * Created by dongweij on 2015/8/12.
 */
public class Problem6 {
    public static void rotate(int[][] matrix) {
        int i, j;
        int size = matrix.length;
        for(i = 0; i < size / 2; i++) {
            for(j = 0; j < size / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[size - 1 - j][i];
                matrix[size - 1 - j][i] = matrix[size - 1 - i][size - 1 - j];
                matrix[size - 1 - i][size - 1 - j] = matrix[j][size - 1 - i];
                matrix[j][size - 1 - i] = temp;
            }
        }
        if(size % 2 == 1) {
            for(i = 0; i < size / 2; i++) {
                int temp = matrix[i][size / 2];
                matrix[i][size / 2] = matrix[size / 2][i];
                matrix[size / 2][i] = matrix[size - i - 1][size / 2];
                matrix[size - i - 1][size / 2] = matrix[size / 2][size - i - 1];
                matrix[size / 2][size - i - 1] = temp;
            }
        }
    }

    //Standard rotation, three steps
    public static void main(String[] args) {
        int i, j;
        int[][] matrix = { {1, 2}, {3, 4} };
        for(i = 0; i < matrix.length; i++) {
            for(j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        rotate(matrix);
        for(i = 0; i < matrix.length; i++) {
            for(j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
