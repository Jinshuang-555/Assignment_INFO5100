package Assignment2;

public class Leetcode1 {
    public static int[][] transpose(int[][] matrix) {
        int[][] res = new int[matrix[0].length][matrix.length];
        for (int i =0; i<matrix[0].length; i++) {
            for (int j =0; j<matrix.length; j++) {
                res[i][j] = matrix[j][i];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] example1 = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] output1 = transpose(example1);
        for (int i=0; i<output1.length; i++) {
            System.out.println();
            for (int j=0; j<output1[0].length; j++) {
                System.out.print(" " + output1[i][j]);
            }
        }

        int[][] example2 = {{1,2,3},{4,5,6}};
        int[][] output2 = transpose(example2);
        for (int i=0; i<output2.length; i++) {
            System.out.println();
            for (int j=0; j<output2[0].length; j++) {
                System.out.print(" " + output2[i][j]);
            }
        }
    }
}
