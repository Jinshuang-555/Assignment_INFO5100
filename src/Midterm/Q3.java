package Midterm;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * input int[] arr = {1,3,-1,3,4,-1}
 * output 2
 */
public class Q3 {
    public static int repeatSum(int[] nums) {
        Set<Integer> collections = new HashSet<>();
        Set<Integer> repeats = new HashSet<>();
        for (int i: nums) {
            if(!collections.add(i)) {
                repeats.add(i);
            }
        }
        int sum = 0;
        for (int i:repeats) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] input = {1,3,-1,3,4,-1};
        System.out.println(repeatSum(input));
    }
}
