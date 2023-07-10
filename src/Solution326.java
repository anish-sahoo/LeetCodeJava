public class Solution326 {
    public boolean isPowerOfThree(int n) {
        if(n<=0)
            return false;
        if(n == 1)
            return true;
        else return power(n) == 0;
    }

    public int power(int a){
        if(a == 1){
            return 0;
        }
        if(a%3 != 0){
            return -1;
        }
        else return power(a/3);
    }
}
