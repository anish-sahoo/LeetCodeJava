import java.util.Arrays;

class Solution567 {
  public boolean checkInclusion(String s1, String s2) {
    if (s1.length() > s2.length()) {
      return false;
    }
    int[] arr = new int[26];
    int size = s1.length();
    int[] arr2 = new int[26];
    for (int i = 0; i < size; i++) {
      arr[s1.charAt(i) - 'a']++;
      arr2[s2.charAt(i) - 'a']++;
    }
    if (Arrays.equals(arr, arr2)) {
      return true;
    }
    for (int i = size; i < s2.length(); i++) {
      arr2[s2.charAt(i - size) - 'a']--;
      arr2[s2.charAt(i) - 'a']++;
      if (Arrays.equals(arr, arr2)) {
        return true;
      }
    }
    return false;
  }
}