import java.util.Arrays;

class Solution35 {
    public int searchInsert(int[] nums, int target) {
        if(target > nums[nums.length-1]){
            return nums.length;
        }
        if(target < nums[0]){
            return 0;
        }
        int solution = Arrays.binarySearch(nums, target);
        if(solution < 0)
            return Math.abs(solution) -1;
        return solution;
    }
}