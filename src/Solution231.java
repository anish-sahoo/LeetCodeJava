public class Solution231 {
    public boolean isPowerOfTwo(int n) {
        if(n<=0)
            return false;
        if(n <= 2)
            return true;
        else return power(n) == 0;
    }
    public int power(int a){
        if(a == 1){
            return 0;
        }
        if(a%2 != 0){
            return -1;
        }
        else return power(a/2);
    }
}
