import java.util.*;

class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> a = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            a.put(nums[i],i);
        }
        for(int num: a.keySet()){
            if(a.containsKey(target-num))
                return new int[]{a.get(num), a.get(target-num)};
        }
        return new int[]{-1,-1};
    }
}