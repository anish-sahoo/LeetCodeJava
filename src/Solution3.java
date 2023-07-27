import java.util.HashSet;

public class Solution3 {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int front_ptr = 0, end_ptr = 0;
        int max = 0;

        while(front_ptr < s.length()){
            if(!set.contains(s.charAt(front_ptr))){
                set.add(s.charAt(front_ptr));
                if(max > (front_ptr - end_ptr + 1)){
                    max = (front_ptr - end_ptr + 1);
                }
                front_ptr++;
            }
            else {
                set.remove(s.charAt(end_ptr));
                end_ptr++;
            }
        }
        System.gc();
        return max;
    }
}
