package Assignment2;

public class Leetcode4 {
    public static void rotate(int[][] matrix) {
        for (int i=0; i<matrix.length; i++) {
            for (int j=i; j<matrix[0].length; j++) {
                int temp = matrix[j][i];
                matrix[j][i]=matrix[i][j];
                matrix[i][j]= temp;
            }
        }
        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[0].length/2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix[0].length-1-j];
                matrix[i][matrix[0].length-1-j]=temp;
            }
        }
    }

    public static void main(String[] args) {
        int[][] input1 = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(input1);
        for (int i=0; i<input1.length; i++) {
            System.out.println();
            for (int j=0;j<input1.length; j++) {
                System.out.print(" " + input1[i][j]);
            }
        }

        int[][] input2 = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        rotate(input2);
        for (int i=0; i<input2.length; i++) {
            System.out.println();
            for (int j=0;j<input2.length; j++) {
                System.out.print(" " + input2[i][j]);
            }
        }
    }
}
