public class Solution5 {
    public String longestPalindrome(String s) {
        if(s.length() < 2){
            System.gc();
            return s;
        }
        int left=0, right=1, len = s.length();
        String largest = "";
        while(right <= len){
            String current = s.substring(left, right);
            if( checkPalindrome(current, current.length()) ) {
                if (current.length() > largest.length()) {
                    largest = current;
                }
                if(left > 0){
                    left--;
                }
                right++;
            }
            else if(left < right){
                left++;
            }
        }
        return largest;
    }

    boolean checkPalindrome(String chars, int length){
        if(length <= 1)
            return true;
        for (int i = 0; i < length/2; i++) {
            if(chars.charAt(i) != chars.charAt(length-i-1))
                return false;
        }
        return true;
    }

    String longestPalDP(String s){
        if(s.length() < 2){
            return s;
        }
        int len = s.length();
        boolean[][] dp = new boolean[len][len];
        for (int i = 0; i < len; i++) {
            dp[i][i] = true;
        }
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if(checkPalindrome(s.substring(i,j), j-i)){
                    dp[i][j] = true;
                }
            }
        }
        for (int i = 0; i < len; i++) {
            if(dp[i][len-1]){
                return s.substring(i, len-1);
            }
        }
        return "";
    }

    public static void main(String[] args) {
        System.out.println(new Solution5().longestPalindrome("babad"));
        System.out.println(new Solution5().longestPalindrome("cbbd"));
        System.out.println(new Solution5().longestPalindrome("bb"));
    }
}
