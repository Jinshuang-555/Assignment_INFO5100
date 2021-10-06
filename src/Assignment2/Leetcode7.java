package Assignment2;

public class Leetcode7 {
    public static String addStrings(String num1, String num2) {
        int idx1 = num1.length()-1;
        int idx2 = num2.length()-1;
        StringBuilder sb = new StringBuilder();
        int carry=0;
        while (idx1 >=0 || idx2>=0) {
            int res1 = idx1 >=0 ? num1.charAt(idx1)-'0' : 0;
            int res2 = idx2 >=0 ? num2.charAt(idx2)-'0' : 0;
            idx1--;
            idx2--;
            int total = res1 +res2 + carry;
            int add = total%10;
            carry = total/10;
            sb.append(add);
        }
        if (carry>0) {
            sb.append(carry);
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(addStrings("11", "123"));
        System.out.println(addStrings("456", "77"));
    }
}
