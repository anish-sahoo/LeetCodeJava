public class Solution7 {
    public int reverse(int x) {
        int sign;
        if(x >= 0){
            sign = 1;
        }
        else sign = -1;
        x = x*sign; //making things positive

        if(x > 999999999){ //if 10 digit
            if(x%10 > 2){
                return 0;
            }
            int d1_after_rev = x%10;
            int rest_after_rev = x/10;
            int reversed = 0;

            while (rest_after_rev>0){
                reversed = reversed*10 + rest_after_rev%10;
                rest_after_rev/=10;
            }
            if(d1_after_rev == 2 && reversed <= 147483647){
                return (d1_after_rev*1000000000 + reversed)*sign;
            }                         // 1493847412
            else return 0;
        }
        int reversed = 0;
        while (x>0){
            reversed = reversed*10 + x%10;
            x/=10;
        }
        return reversed*sign;
    }

    public static void main(String[] args) {
        Solution7 obj = new Solution7();
        System.out.println(obj.reverse(1599999999));
        System.out.println(obj.reverse(1493847412));
        System.out.println(obj.reverse(-123456789));
        System.out.println(obj.reverse(987654321));
        System.out.println(obj.reverse(123456789));
        System.out.println(obj.reverse(123));
        System.out.println(obj.reverse(0));
        System.out.println(obj.reverse(-12313));
        System.out.println(obj.reverse(-2147483412));
    }
}