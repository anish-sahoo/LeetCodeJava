import java.util.HashMap;

public class Solution290 {
    public boolean wordPattern(String pattern, String s) {
        String[] str = s.split(" ");
        if(str.length != pattern.length()){
            System.gc();
            return false;
        }

        HashMap<Character, String> map = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            if(!map.containsValue(str[i]))
                map.put(pattern.charAt(i), str[i]);
        }
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < pattern.length(); i++) {
            if(!map.containsKey(pattern.charAt(i))){
                System.gc();
                return false;
            }
            if( !map.get(pattern.charAt(i)).equals(str[i]) ){
                System.gc();
                return false;
            }
        }
        System.gc();
        return true;
    }
}