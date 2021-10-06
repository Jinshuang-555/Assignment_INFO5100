package Assignment2;

public class Leetcode9 {
    public static String reverseWords(String s) {
        String[] words = s.split(" ");
        for (int i=0; i<words.length; i++) {
            String temp = words[i].replaceAll("[^a-zA-Z0-9]","");
            words[i] = temp;
        }
        String res="";
        for (int i=words.length-1; i>=1; i--) {
            if (words[i]!=null&&words[i].length()!=0) {
                res += words[i];
                res += " ";
            }
        }
        if (words[0].length()!=0) {
            res += words[0];
        } else {
            res = res.substring(0, res.length()-1);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("  hello world  ")+"====");
        System.out.println(reverseWords("Alice does not even like bob")+"====");
    }
}
