import java.util.HashMap;

public class Solution13 {
    public int romanToInt(String s) {
        int answer = 0;
        HashMap<String, Integer> items = new HashMap<>();
        items.put("I", 1);
        items.put("V", 5);
        items.put("X", 10);
        items.put("L", 50);
        items.put("C", 100);
        items.put("D", 500);
        items.put("M", 1000);
        for(int i=0; i<s.length(); i++){
            if(i < s.length()-1) {
                if (items.get(s.charAt(i) + "") < items.get(s.charAt(i + 1) + ""))
                    answer -= items.get(s.charAt(i) + "");
                else answer += items.get(s.charAt(i)+"");
            }
            else answer += items.get(s.charAt(i)+"");
        }
        return answer;
    }
}
