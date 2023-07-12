import java.util.Arrays;

public class Solution14 {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < Math.min(strs[0].length(), strs[strs.length-1].length()); i++) {
            if(strs[0].charAt(i) == strs[strs.length-1].charAt(i)){
                s.append(strs[0].charAt(i));
            }
            else break;
        }
        return s.toString();
    }
}
