import java.util.HashMap;
import java.util.HashSet;

public class Solution383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> magazineMap = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            char a = magazine.charAt(i);
            int count = magazineMap.getOrDefault(a,0);
            magazineMap.put(a,count+1);
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            char a = ransomNote.charAt(i);
            int count = magazineMap.getOrDefault(a,0);
            if(count == 0) {
                System.gc();
                return false;
            }
            else magazineMap.put(a,count-1);
        }
        System.gc();
        return true;
    }
}
