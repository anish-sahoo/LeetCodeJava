public class Solution9 {
    public boolean isPalindrome(int x) {
        String a = x+"";
        return (new StringBuffer(x+"").reverse()).equals(x+"");
    }
}
