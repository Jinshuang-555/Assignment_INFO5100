package Assignment2;

public class Leetcode3 {
    public static void moveZeroes(int[] nums) {
        int lastNonZeroFoundAt=0, idx =0;
        while(idx<nums.length) {
            if (nums[idx]!=0) {
                nums[lastNonZeroFoundAt] = nums[idx];
                lastNonZeroFoundAt++;
            }
            idx++;
        }
        while(lastNonZeroFoundAt<nums.length){
            nums[lastNonZeroFoundAt] =0;
            lastNonZeroFoundAt++;
        }
    }

    public static void main(String[] args) {
        int[] input1 = {0,1,0,3,12};
        moveZeroes(input1);
        System.out.println();
        for (int i: input1) {
            System.out.print(i+" ");
        }

        int[] input2 = {0};
        moveZeroes(input2);
        System.out.println();
        for (int i: input2) {
            System.out.print(i);
        }
    }
}
