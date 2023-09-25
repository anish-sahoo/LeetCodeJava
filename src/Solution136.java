public class Solution136 {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for(int a: nums){
            ans = a ^ ans;
        }
        return ans;
    }
}
