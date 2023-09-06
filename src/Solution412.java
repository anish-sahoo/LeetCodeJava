import java.util.*;

class Solution412 {
    //most elegant theoretically, but slow irl
    public List<String> fizzBuzz(int n) {
        List<String> l = new ArrayList<>();
        HashMap<Integer, String> map = new HashMap<>();
        map.put(3, "Fizz");
        map.put(5, "Buzz");

        for(int i=1; i<=n; i++){
            String a = "";
            for (int key: map.keySet()) {
                a += ((i % key == 0) ? map.get(key) : "");
            }
            if(a.isEmpty()){
                a += i;
            }
            l.add(a);
        }
        return l;
    }


    //This is wayyyy faster, <2ms solutions
    public List<String> fizzBuzz2(int n) {
        List<String> l = new ArrayList<>();
        for(int i=1; i<=n; i++){
            String a = "";
            if(i%3 == 0)
                a+="Fizz";
            if(i%5 == 0)
                a+="Buzz";
            if(a == "")
                l.add(i+"");
            else l.add(a);
        }
        return l;
    }
}

