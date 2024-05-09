class Solution72 {
  // levenshtein distance implementation from wikipedia
  public int minDistance(String word1, String word2) {
    int m = word1.length();
    int n = word2.length();

    int[] v0 = new int[n + 1];
    int[] v1 = new int[n + 1];

    for (int i = 0; i <= n; i++) {
      v0[i] = i;
    }

    for (int i = 0; i < m; i++) {
      v1[0] = i + 1;
      for (int j = 0; j < n; j++) {
        int deletionCost = v0[j + 1] + 1;
        int insertionCost = v1[j] + 1;
        int substitutionCost = word1.charAt(i) == word2.charAt(j) ? v0[j] : v0[j] + 1;

        v1[j + 1] = Math.min(Math.min(deletionCost, insertionCost), substitutionCost);
      }
      System.arraycopy(v1, 0, v0, 0, v1.length);
    }

    return v0[n];
  }
}