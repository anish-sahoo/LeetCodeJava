import java.util.Arrays;

class Solution34 {
    public int[] searchRange(int[] nums, int target) {        ;
        if(nums.length == 0){
            return new int[]{-1,-1};
        }
        int index = binarySearch(nums, target, 0, nums.length-1);
        System.out.println("index: " + index);
        if(index < 0){
            return new int[]{-1,-1};
        }
        int left = binarySearch(nums, target, 0, index - 1);
        int right = binarySearch(nums, target, index+1, nums.length-1);
        System.out.println("left: " + left + " right: " + right);
        if(left != -1){
            return new int[]{Math.min(left, index), Math.max(index, Math.max(left, right))};
        }
        if(right != -1){
            return new int[]{Math.min(index, right), Math.max(index, Math.max(left, right))};
        }
        return new int[]{index, index};
    }
    int binarySearch(int[] arr, int target, int left, int right){
        int mid;
        while(left <= right){
            mid = (left + right)/2;
            if(arr[mid] == target)
                return mid;
            if(arr[mid] > target)
                right = mid-1;
            else
                left = mid+1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = new int[]{1,1,1,1,1,1,2,3,4,4,5,5,5,6,7,8,8,8,8};
        System.out.println(Arrays.toString(new Solution34().searchRange(a, 8)));
    }
}