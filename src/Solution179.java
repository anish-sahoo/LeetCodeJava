import java.util.Arrays;

class Solution179 {
  public String largestNumber(int[] nums) {
    String[] numS = new String[nums.length];
    for (int i = 0; i < nums.length; i++) {
      numS[i] = nums[i] + "";
    }
    Arrays.sort(numS, (a, b) -> (b + a).compareTo(a + b));
    if (numS[0].equals("0")) {
      return numS[0];
    }
    StringBuilder answer = new StringBuilder();
    for (int i = 0; i < nums.length; i++) {
      answer.append(numS[i]);
    }
    return answer.toString();
  }
}