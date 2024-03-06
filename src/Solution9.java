public class Solution9 {
    public boolean isPalindrome(int x) {
        return (new StringBuffer(x).reverse().toString()).equals(x);
    }
}
