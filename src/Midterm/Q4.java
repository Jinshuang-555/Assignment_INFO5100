package Midterm;

import java.util.HashSet;
import java.util.Set;

// longest subString without repeating characters
// abcabcbb - abc
public class Q4 {
    public static String longestNonRepeatingString(String s) {
        String sub = "";
        int start =0, end =0;
        int maxLength = Integer.MIN_VALUE;
        Set<Character> set = new HashSet<>();
        while (start < s.length() && end<s.length()) {
            if (set.add(s.charAt(end))) {
                end++;
            } else if (!set.add(s.charAt(end))) {
                if (end-start>maxLength) {
                    maxLength = end-start;
                    sub = s.substring(start,end);
                }
                set = new HashSet<>();
                start = end;
            }
        }
        return sub;
    }

    public static void main(String[] args) {
        System.out.println(longestNonRepeatingString("abcabcbb"));
    }

}
