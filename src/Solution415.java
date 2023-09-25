public class Solution415 {
    public String addStrings(String num1, String num2) {
        if (num1 == null || num1.length() == 0 || num1.equals("0")) {
            return num2;
        }
        if (num2 == null || num2.length() == 0 || num2.equals("0")) {
            return num1;
        }
        StringBuilder ans = new StringBuilder();
        StringBuilder s1 = new StringBuilder(num1).reverse();
        StringBuilder s2 = new StringBuilder(num2).reverse();
        int carry = 0;
        for (int i = 0; i < s1.length() || i < s2.length(); i++) {
            int num = carry;
            if (i < s1.length()) {
                num += s1.charAt(i) - '0';
            }
            if (i < s2.length()) {
                num += s2.charAt(i) - '0';
            }
            ans.append(num%10);
            carry = num/10;
        }
        if (carry != 0)
            ans.append(carry);
        return ans.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(new Solution415().addStrings("11", "123"));
    }
}
