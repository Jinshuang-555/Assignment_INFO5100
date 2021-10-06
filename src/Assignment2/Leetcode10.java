package Assignment2;

public class Leetcode10 {
    public static int compress(char[] chars) {
        int indexAns = 0, index = 0;
        while(index < chars.length){
            char currentChar = chars[index];
            int count = 0;
            while(index < chars.length && chars[index] == currentChar){
                index++;
                count++;
            }
            chars[indexAns++] = currentChar;
            if(count != 1)
                for(char c : Integer.toString(count).toCharArray())
                    chars[indexAns++] = c;
        }
        return indexAns;
    }

    public static void main(String[] args) {
        char[] input1 = {'a','a','b','b','c','c','c'};
        char[] input2 = {'a'};
        System.out.println(compress(input1));
        System.out.println(compress(input2));
    }
}
