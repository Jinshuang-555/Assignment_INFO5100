package Assignment2;

import java.util.Locale;

public class Leetcode8 {
    public static boolean isPalindrome(String s) {
        s=s.toLowerCase();
        s=s.replaceAll("[^a-zA-Z0-9]","");
        int left =0, right = s.length()-1;
        while (left<right) {
            if (s.charAt(left)!=s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("race a car"));
    }
}
