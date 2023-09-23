import java.lang.reflect.Array;
import java.util.Arrays;

class Solution20 {
    public boolean isValid(String s){
        char[] a = new char[s.length()];
        int i = 0;
        for(char c: s.toCharArray()){
            switch (c){
                case ')' -> {
                    if(i==0 || a[--i] != '(' ){
                        return false;
                    }
                }
                case ']' -> {
                    if(i==0 || a[--i] != '['){
                        return false;
                    }
                }
                case '}' -> {
                    if(i==0 || a[--i] != '{'){
                        return false;
                    }
                }
                default -> a[i++] = c;
            }
        }
        return i == 0;
    }

    public static void main(String[] args) {
        System.out.println(new Solution20().isValid("()[]{}"));
    }
}
