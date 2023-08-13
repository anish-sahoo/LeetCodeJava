import java.util.Arrays;
import java.util.HashSet;

// TODO: 8/13/23 another way to solve this would be through cyclic sort, to be added later
public class Solution41 {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int length = nums.length-1;
        if(nums[length] <= 0 || nums[0] > 1){
            System.gc();
            return 1;
        }
        HashSet<Integer> set = new HashSet<>((length+1));
        for (int num : nums) {
            set.add(num);
        }
        for (int i = 1; i < nums[length]; i++) {
            if(!set.contains(i)){
                System.gc();
                return i;
            }
        }
        System.gc();
        return nums[length]+1;
    }
}
