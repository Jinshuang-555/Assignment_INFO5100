package Assignment1;

import java.util.Arrays;

public class Question4 {
    public static void main(String[] args) {
        System.out.println(canConstruct("a","b"));
        System.out.println(canConstruct("aa","aab"));
    }
    public static boolean canConstruct(String ransomNote, String magazine) {
        char[] chars1 = ransomNote.toCharArray();
        char[] chars2 = magazine.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        return String.valueOf(chars2).contains(String.valueOf(chars1));
    }
}
