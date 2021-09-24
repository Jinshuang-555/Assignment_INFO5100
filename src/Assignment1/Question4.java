package Assignment1;

import java.util.Arrays;

public class Question4 {
    public static void main(String[] args) {
        System.out.println(canConstruct("a","b"));
        System.out.println(canConstruct("aa","aab"));
    }
    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] map = new int[26];
        for(char c : magazine.toCharArray()) map[c - 'a']++;
        for(char c : ransomNote.toCharArray()) {
            if(map[c - 'a'] == 0) return false;
            map[c - 'a']--;
        }
        return true;
    }
}
