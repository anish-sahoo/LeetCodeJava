public class Solution342 {
    public boolean isPowerOfFour(int n) {
        if(n<=0)
            return false;
        if(n == 1)
            return true;
        if(n<4 && n>1)
            return false;
        else return power(n) == 0;
    }

    public int power(int a){
        if(a == 1){
            return 0;
        }
        if(a%4 != 0){
            return -1;
        }
        else return power(a/4);
    }
}
