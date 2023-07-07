import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

class Solution26 {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int n:nums){
            set.add(n);
        }

        ArrayList<Integer> n = new ArrayList<>(set);
        Collections.sort(n);

        for (int i = 0; i < n.size(); i++) {
            nums[i] = n.get(i);
        }
        return set.size();
    }

    public static void main(String[] args) {
        int[] a = new int[]{1,1,2};
        System.out.println(new Solution26().removeDuplicates(a));
        System.out.println(Arrays.toString(a));
    }
}