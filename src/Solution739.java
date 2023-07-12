//time limit exceeded, come back and fix this later

public class Solution739 {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] answer = new int[temperatures.length];
        for (int i = 0; i < temperatures.length - 1; i++) {
            for (int j = i+1; j < temperatures.length; j++) {
                if(temperatures[j] > temperatures[i]){
                    answer[i] = j - i;
                    break;
                }
            }
        }
        answer[answer.length-1] = 0;
        return answer;
    }
}
