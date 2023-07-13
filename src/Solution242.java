import java.util.Arrays;

public class Solution242 {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            System.gc();
            return false;
        }
        char[] a1 = s.toCharArray();
        char[] a2 = t.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        System.gc();
        return new String(a1).equals(new String(a2));
    }
}
