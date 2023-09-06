// TODO: 8/31/23 Fix this and make it work
//
public class Solution5 {
//    public String longestPalindrome(String s) {
//        if(s.length() < 2){
//            System.gc();
//            return s;
//        }
//
//        int left=0, right=1, len = s.length();
//        String largest = "", current;
//
//        while(right <= len){
//            current = s.substring(left, right);
//            if( checkPalindrome(current.toLowerCase().toCharArray(), current.length())) {
//                if (current.length() > largest.length()) {
//                    largest = current;
//                }
//                right++;
//            }
//            if(left > 0 && left < right){
//                left--;
//            }
//            else if(left < right){
//                left++;
//            }
//        }
//        return largest;
//    }
//    public boolean checkPalindrome(char[] a, int l){
//        for (int i = 0; i < l / 2; i++) {
//            if(a[i] != a[l-i-1]){
//                return false;
//            }
//        }
//        return true;
//    }
//
//    public static void main(String[] args) {
////        System.out.println(new Solution5().longestPalindrome("babad"));
////        System.out.println(new Solution5().longestPalindrome("cbbd"));
//        System.out.println(new Solution5().longestPalindrome("bb"));
//    }
}
