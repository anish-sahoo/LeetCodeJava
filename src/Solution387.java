// Using HashMaps (the way this program was intended to be solved), works well but to get a faster runtime use character arrays instead

import java.util.HashMap;

public class Solution387 {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch, 1);
            }
            else map.put(ch, map.get(ch)+1);
        }
        for (int i = 0; i < s.length(); i++) {
            if(map.get(s.charAt(i)) == 1){
                System.gc();
                return i;
            }
        }
        System.gc();
        return -1;
    }
}
