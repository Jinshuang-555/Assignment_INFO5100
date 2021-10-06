package Assignment2;

import java.util.*;

public class Leetcode6 {
    public static boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        Set<Character> assignedValues = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i)) && map.get(s.charAt(i)) != t.charAt(i)) {
                return false;
            }
            if (!map.containsKey(s.charAt(i)) && assignedValues.contains(t.charAt(i))) {
                return false;
            }
            map.put(s.charAt(i), t.charAt(i));
            assignedValues.add(t.charAt(i));
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg","add"));
        System.out.println(isIsomorphic("foo","bar"));
    }
}
