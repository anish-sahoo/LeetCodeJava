public class Solution409 {
    public int longestPalindrome(String s) {
        int[] characters = new int[123];
        for (char ch: s.toCharArray()) {
            characters[ch]++;
        }
        int count = 0, odd = 0;
        for(int i='A'; i<='z'; i++){
            if(characters[i] > 0){
                count += (characters[i]/2)*2;
                if(characters[i] %2 != 0)
                    odd++;
            }
        }
        if(odd > 0){
            return count+1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new Solution409().longestPalindrome("abccccdd"));
        System.out.println(new Solution409().longestPalindrome("bananas"));
        System.out.println(new Solution409().longestPalindrome("aaaAaaaa"));
    }
}
