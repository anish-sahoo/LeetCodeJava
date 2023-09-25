public class Solution389 {
    public char findTheDifference(String s, String t) {
        int a = 0, b = 0;
        for(int i=0; i<s.length(); i++){
            a = a ^ s.charAt(i);
        }
        for(int j=0; j<t.length(); j++){
            b = b^t.charAt(j);
        }
        return (char) (a^b);
    }
}
