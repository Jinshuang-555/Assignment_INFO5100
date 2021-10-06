package Assignment2;

public class Leetcode2 {
    public static int shortestDistance(String[] wordsDict, String word1, String word2) {
        int minDist = Integer.MAX_VALUE;
        for (int i=0; i<wordsDict.length; i++) {
            if (wordsDict[i].equals(word1)) {
                for (int j=0; j<wordsDict.length; j++) {
                    if (wordsDict[j].equals(word2)) {
                        minDist = Math.min(minDist,Math.abs(i-j));
                    }
                }
            }
        }
        return minDist;
    }

    public static void main(String[] args) {
        String[] wordsDict = {"practice", "makes", "perfect", "coding", "makes"};
        String word1 = "coding", word2 = "practice";
        System.out.println(shortestDistance(wordsDict,word1,word2));

        String[] wordsDict1 = {"practice", "makes", "perfect", "coding", "makes"};
        String word11 = "makes", word12 = "coding";
        System.out.println(shortestDistance(wordsDict1,word11,word12));
    }
}
