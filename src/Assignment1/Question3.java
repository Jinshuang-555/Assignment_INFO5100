package Assignment1;

import java.util.HashMap;
import java.util.List;

public class Question3 {
    public static void main(String[] args) {
        int[] test = new int[]{2,3,4,2,2,3,5,7};
        System.out.println(findFirstUnique(test));
    }
    // Find first non repeated integer in an array
    public static int findFirstUnique(int[] nums) {
        HashMap<Integer,Integer> count = new HashMap<>();
        for (int i: nums) {
            count.put(i, count.getOrDefault(i,0)+1);
        }
        for (int i : nums) {
            if (count.get(i)==1) {
                return i;
            }
        }
        return -1;
    }
}
