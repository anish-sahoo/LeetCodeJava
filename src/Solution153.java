public class Solution153 {
    public int findMin(int[] nums) {
        int left=0, right = nums.length - 1, answer = nums[right];
        while(left <= right){
            int mid = left + (right-left)/2;
            if(nums[mid] < nums[nums.length-1]){
                if(nums[mid] < answer)
                    answer = nums[mid];
            }
            if(nums[mid] > answer){
                left = mid + 1;
            }
            else right = mid - 1;
        }
        return answer;
    }
}
