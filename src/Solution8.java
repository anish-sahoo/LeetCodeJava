import java.math.BigInteger;
import java.util.HashMap;
import java.util.HashSet;

public class Solution8 {
    public int myAtoi(String s) {
        HashSet<Character> set = new HashSet<>(13);
        set.add('0');
        set.add('1');
        set.add('2');
        set.add('3');
        set.add('4');
        set.add('5');
        set.add('6');
        set.add('7');
        set.add('8');
        set.add('9');
        set.add('+');
        set.add('-');
        set.add('.');
        s = s.trim();

        StringBuilder a = new StringBuilder();
        int multiplier = 1, count = 0, digit_count = 0;
        for (char chr:s.toCharArray()) {
            if(Character.isLetter(chr) || chr == ' ' || chr == '.'){
                break;
            }
            if(chr == '+' || chr == '-'){
                if(count != 0 || digit_count != 0){
                    break;
                }
                multiplier = (chr == '+'?1:-1);
                count++;
                continue;
            }
            if(set.contains(chr)){
                digit_count++;
                a.append(chr);
            }
        }
        if(!a.toString().isEmpty()) {
            BigInteger bigI = new BigInteger(a.toString());
            bigI = bigI.multiply(new BigInteger(multiplier+""));
            BigInteger intMax = new BigInteger(Integer.MAX_VALUE + "");
            BigInteger intMin = new BigInteger(Integer.MIN_VALUE + "");
            if(bigI.compareTo(intMax) > 0){
                return Integer.MAX_VALUE;
            }
            else if(bigI.compareTo(intMin) < 0){
                return Integer.MIN_VALUE;
            }
            return bigI.intValueExact();
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(new Solution8().myAtoi("   42"));
    }
}
