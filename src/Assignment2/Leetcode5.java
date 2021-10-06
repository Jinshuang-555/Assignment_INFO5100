package Assignment2;

import com.sun.deploy.security.BadCertificateDialog;

import java.util.ArrayList;
import java.util.List;

public class Leetcode5 {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        if (matrix==null || matrix.length==0) return res;
        int left = 0, up =0;
        int right = matrix[0].length-1, down = matrix.length-1;
        int size = matrix.length * matrix[0].length;
        while (res.size()<size) {
            for (int i=left; i<=right&& res.size()<size; i++) {
                res.add(matrix[up][i]);
            }
            up++;
            for (int i = up; i<=down&& res.size()<size; i++) {
                res.add(matrix[i][right]);
            }
            right--;
            for (int i= right; i>=left&& res.size()<size; i--) {
                res.add(matrix[down][i]);
            }
            down--;
            for (int i = down; i>=up&& res.size()<size; i--){
                res.add(matrix[i][left]);
            }
            left++;
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] input1 = {{1,2,3},{4,5,6},{7,8,9}};
        for (int i: spiralOrder(input1)){
            System.out.print(" " + i);
        }
        System.out.println();
        int[][] input2 = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        for (int i: spiralOrder(input2)){
            System.out.print(" " + i);
        }
    }
}
