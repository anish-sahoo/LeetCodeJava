import java.util.Arrays;
import java.util.LinkedList;

public class Solution345 { //very high memory and slow runtime, fix later
    //inefficient
    public String reverseVowels(String s) {
        LinkedList<Character> list = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            char chr = Character.toLowerCase(s.charAt(i));
            if(chr == 'a' ||
                    chr == 'e' ||
                    chr == 'i' ||
                    chr == 'o' ||
                    chr == 'u'){
                list.add(s.charAt(i));
            }
        }
        String cp = s.replaceAll("([aeiouAEIOU])",Character.toString(128));
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < cp.length(); i++) {
            if(cp.charAt(i) == 128){
                answer.append(list.removeLast());
            }
            else answer.append(cp.charAt(i));
        }
        return answer.toString();
    }

    //fastest
    public String reverseVowels2(String s) {
        int i = 0, j = s.length() - 1;
        char[] ch = s.toCharArray();
        while (i < j) {
            while (i < j && ch[i] != 'a' && ch[i] != 'e' && ch[i] != 'i' && ch[i] != 'o' && ch[i] != 'u' && ch[i] != 'A' && ch[i] != 'E' && ch[i] != 'I' && ch[i] != 'O' && ch[i] != 'U') {
                i++;
            }
            while (j > i && ch[j] != 'a' && ch[j] != 'e' && ch[j] != 'i' && ch[j] != 'o' && ch[j] != 'u' && ch[j] != 'A' && ch[j] != 'E' && ch[j] != 'I' && ch[j] != 'O' && ch[j] != 'U') {
                j--;
            }
            if (i < j) {
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;
                i++;
                j--;
            }
        }
        return String.valueOf(ch);
    }

    public static void main(String[] args) {
        Solution345 obj = new Solution345();
        System.out.println(obj.reverseVowels("hello"));
        System.out.println(obj.reverseVowels("leetcode"));
        System.out.println(obj.reverseVowels("a."));
        System.out.println(obj.reverseVowels("Marge, let's \"went.\" I await news telegram."));
        System.out.println(obj.reverseVowels(" apG0i4maAs::sA0m4i0Gp0"));
        System.out.println(" ipG0A4mAas::si0m4a0Gp0");
    }
}

/*
Try using a loop
left half = keep adding letters, when encountering a vowel, swap with the vowel from the left end
 */