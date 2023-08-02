public class Solution70 {
    public int climbStairs(int n) {
        if(n < 2){
            return n;
        }
        int a = 1, b = 1;
        for (int i = 2; i <= n; i++) {
            int dp_i = a + b;
            a = b;
            b = dp_i;
        }
        return b;
    }
}
