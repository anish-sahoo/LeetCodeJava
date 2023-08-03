// TODO: 8/3/2023 fix this, failing some testcases 

public class Solution33 {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length-1;
        if(nums[0] == target){
            return 0;
        }
        if(nums[right] == target){
            return right;
        }
                                //  {4,5,6,7,8,1,2,3}, 8)           Left =4, Right =7, Mid =5
        while(left <= right){
            int mid = left + (right - left)/2;
            System.out.println("Left ="+left+", Right ="+right+", Mid ="+mid);
            if(nums[mid] == target){
                System.gc();
                return mid;
            }

            if(nums[mid] > nums[right]){
                if(target > nums[mid] || target < nums[left]){
                    left = mid + 1;
                }
            }
            else {
                if(target < nums[mid]){
                    right = mid - 1;
                }
                else left = mid + 1;
            }
        }
        System.gc();
        return -1;
    }

    public static void main(String[] args) {
        //System.out.println(new Solution33().search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0));
        //System.out.println(new Solution33().search(new int[]{1, 3}, 3));
        //System.out.println(new Solution33().search(new int[]{3, 5, 1}, 3));
        //System.out.println(new Solution33().search(new int[]{5, 1, 3}, 5));
        System.out.println(new Solution33().search(new int[]{4,5,6,7,8,1,2,3}, 8));
    }
}
