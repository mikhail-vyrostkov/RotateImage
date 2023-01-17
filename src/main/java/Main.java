import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}, {21, 22, 23, 24, 25}};
        System.out.println(Arrays.deepToString(matrix));
        Solution.rotate(matrix);

    }

    public static class Solution {
        public static void rotate(int[][] matrix) {
            int a;
            for (int k = 0; k < matrix.length/2;k++) {
                for (int i = 0; i < matrix.length - 1 - (k*2); i++) {
                    a = matrix[k][i + k];
                    matrix[k][i + k] = matrix[(matrix.length - 1) - i - k][k];
                    matrix[(matrix.length - 1) - i - k][k] = matrix[matrix.length - 1 - k][(matrix.length - 1) - i - k];
                    matrix[matrix.length - 1 - k][(matrix.length - 1) - i - k] = matrix[i + k][matrix.length - 1 - k];
                    matrix[i + k][matrix.length - 1 - k] = a;
                }
            }
        }
    }
}
