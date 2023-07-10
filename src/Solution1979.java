import java.util.*;

class Solution1979 {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        if(nums[0] == 0){
            return 0;
        }
        return gcd(nums[0], nums[nums.length-1]);
        /* same solution using loops -> more runtime but less memory
        int divisor = nums[0], dividend = nums[nums.length-1];
        while (dividend > 0){
            if(dividend % divisor == 0){
                return divisor;
            }
            int copy = divisor;
            divisor = dividend % divisor;
            dividend = copy;
        }
        return 0;
        */
    }
    int gcd(int divisor, int dividend){
        if(dividend % divisor == 0){
            return divisor;
        }
        return gcd(dividend%divisor, divisor);
    }
}