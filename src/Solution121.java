public class Solution121 {
    public int maxProfit(int[] prices) {
        int maxprofit = 0; //current max profit possible
        int buyprice = prices[0]; //current cheapest price

        for (int i = 1; i < prices.length; i++) {
            int sellprice = prices[i];
            if(sellprice - buyprice > maxprofit & sellprice - buyprice >= 0){
                maxprofit = sellprice - buyprice;
            }
            if(prices[i] < buyprice){
                buyprice = prices[i];
            }
        }
        return maxprofit;
    }

    public static void main(String[] args) {
        System.out.println(new Solution121().maxProfit(new int[]{7,6,4,3,1}));
    }
}
