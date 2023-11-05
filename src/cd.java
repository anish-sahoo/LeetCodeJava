import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class cd{
    public static void main(String[] args) throws IOException {
        int count=0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Integer> set = new HashSet<>();
        String input;
        while(true) {
            input = br.readLine();
            if(input.equals("0 0")){
                break;
            }
            if(input.contains(" ")){
                int N = Integer.parseInt(input.split(" ")[0]);
                int M = Integer.parseInt(input.split(" ")[0]);
                for (int i = 0; i < N+M; i++) {
                    int item = Integer.parseInt(br.readLine());
                    if(set.contains(item)){
                        count++;
                    }
                    else set.add(item);
                }
                System.out.println(count);
                count = 0;
                set.clear();
            }
        }
    }
}