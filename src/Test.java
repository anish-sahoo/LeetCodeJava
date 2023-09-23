import java.util.HashMap;

public class Test {
    int solution(int[] a) {
        if(a.length == 1){
            return -1;
        }
        if(a.length == 2){
            return a[0] == a[1]?a[0]:-1;
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        int current = -1, currentMaxIndex = a.length;
        for(int i:a){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        for(int i: a){
            if(map.get(i) > 1){
                System.out.println("Item = "+ i);
                int copy = i, item = 0;
                while(a[item++] != i && item < a.length){}
                int counter2 = item;
                System.out.println("item index = "+(item-1));

                while(a[counter2++] != i && counter2 < a.length){}
                System.out.println("counter2 = "+ (counter2-1));
                if(counter2 -1 < currentMaxIndex){
                    current = copy;
                    currentMaxIndex = counter2 - 1;
                }
                System.out.println("current max = "+current+"\t"+currentMaxIndex);
            }
        }
        return current;
    }

    public static void main(String[] args) {
        System.out.println(new Test().solution(new int[]{2,1,3,5,3,2}));
    }
}
