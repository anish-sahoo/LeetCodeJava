import java.util.*;

public class Solution187 {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> all = new HashSet<>();
        Set<String> a = new HashSet<>();
        for (int i = 0; i+9 < s.length(); i++) {
            String sub = s.substring(i, i+10);
            if(all.contains(sub)){
                a.add(sub);
            }
            else all.add(sub);
        }
        return new ArrayList<>(a);
    }

    public static void main(String[] args) {
        new Solution187().findRepeatedDnaSequences("AAAAAAAAAAA");
    }
}
