import java.util.Arrays;

public class Solution322 {
  public int coinChange(int[] coins, int amount) {
    int[] dp = new int[amount + 1];
    Arrays.fill(dp, amount + 1);
    dp[0] = 0;

    for (int coin : coins) {
      for (int i = coin; i <= amount; i++) {
        dp[i] = Math.min(dp[i], 1 + dp[i - coin]);
      }
    }
    return dp[amount] > amount ? -1 : dp[amount];
  }

  public static void main(String[] args) {
    Solution322 obj = new Solution322();
    obj.coinChange(new int[]{1, 2, 5}, 11);
  }
}

