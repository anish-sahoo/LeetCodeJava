import java.util.HashMap;
import java.util.HashSet;

public class Solution383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<String, Integer> ransom = new HashMap<>();
        HashMap<String, Integer> mag = new HashMap<>();
        for(String a:ransomNote.split("")){
            if(ransom.containsKey(a)){
                ransom.put(a, ransom.get(a)+1);
            }
            else ransom.put(a, 1);
        }
        for(String a:magazine.split("")){
            if(mag.containsKey(a)){
                mag.put(a, mag.get(a)+1);
            }
            else mag.put(a, 1);
        }
        for(String a: ransom.keySet()){
            if(!mag.containsKey(a)){
                return false;
            }
            else if(ransom.get(a) > mag.get(a)){
                return false;
            }
        }
        return true;
    }
}
