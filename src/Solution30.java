import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// not very effective at all
// TODO: 8/6/23 Improve this one

public class Solution30 {
    public List<Integer> findSubstring(String s, String[] words) {
        ArrayList<Integer> list = new ArrayList<>();
        if (s == null || s.isEmpty() || words == null || words.length == 0) {
            System.gc();
            return list;
        }

        int wordLength = words[0].length();
        int subsLength = words.length * wordLength;
        int sentenceLength = s.length();
        int difference = sentenceLength - subsLength;

        HashMap<String, Integer> wordCounts = new HashMap<>(words.length);
        HashMap<String, Integer> seenWordCounts = new HashMap<>();

        for (String word : words) {
            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
        }

        for (int i = 0; i <= difference; i++) {
            for (int j = i; j <= i+subsLength-wordLength; j+=wordLength ) {
                String currentWord = s.substring(j, j+ wordLength);
                if(wordCounts.containsKey(currentWord) ){
                    seenWordCounts.put(currentWord, seenWordCounts.getOrDefault(currentWord, 0)+1);
                }
            }
            if( wordCounts.equals(seenWordCounts) )
                list.add(i);
            seenWordCounts.clear();
        }
        System.gc();
        return list;
    }
}