package Final;

public class Q3 {
    /**
     * Given an array of integers nums and an integer k, return the total number of continuous subarrays whose
     * sum equals to k.
     */
    public static void main(String[] args) {
        int[] input1 = {1,1,1};
        System.out.println(continuesSubArray(input1,2));
        int[] input2 = {1,2,3};
        System.out.println(continuesSubArray(input2,3));
    }
    public static int continuesSubArray(int[] nums, int k) {
        int count = 0;
        for (int i=0; i<nums.length-1; i++) {
            int sum = nums[i];
            if (sum == k) { count ++; continue;}
            for (int j = i+1; i< nums.length; i++) {
                sum += nums[j];
                if (sum==k) { count++;  break;}
                if (sum>k) {  break;}
            }
        }
        if (nums[nums.length-1]==k) {count++;}
        return count;
    }
}
