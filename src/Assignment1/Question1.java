package Assignment1;

import java.util.HashMap;

public class Question1 {

    public static void main(String[] args) {
        int[] test1 = new int[] {1,2,3,2};
        System.out.println(sumOfUnique(test1));
        int[] test2 = new int[] {1,2,3,4,5};
        System.out.println(sumOfUnique(test2));
    }
    public static int sumOfUnique(int[] nums) {
        int res = 0;
        HashMap<Integer,Integer> count = new HashMap<>();
        for (int i: nums) {
            count.put(i,count.getOrDefault(i,0)+1);
        }
        for (int i: count.keySet()) {
            if (count.get(i)==1) {
                res += i;
            }
        }
        return res;
    }
}
