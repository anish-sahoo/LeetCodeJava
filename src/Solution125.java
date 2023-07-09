import java.util.Arrays;

public class Solution125 {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int left=0, right=s.length()-1;
        while (left < right){
            while(!Character.isLetterOrDigit(s.charAt(left)) && left<right ){
                left++;
            }
            while (!Character.isLetterOrDigit(s.charAt(right)) && right>0 ){
                right--;
            }

            char lc = s.charAt(left);
            char rc = s.charAt(right);

            if(!Character.isLetterOrDigit(lc) || !Character.isLetterOrDigit(rc))
                return true;

            if(lc != rc){
                return false;
            }

            left++; right--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new Solution125().isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(new Solution125().isPalindrome("ahdskjhdkab"));
        System.out.println(new Solution125().isPalindrome(".,"));
    }
}
