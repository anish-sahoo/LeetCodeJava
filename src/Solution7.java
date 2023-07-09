public class Solution7 {
    public int reverse(int x) {
        int sign;
        if(x >= 0){
            sign = 1;
        }
        else sign = -1;

        String reversed = new StringBuilder(Integer.toString(x*sign)).reverse().toString();

        if(reversed.length() > 10){
            return 0;
        }

        if(reversed.length() == 10){
            if(reversed.charAt(0) > '2'){
                return 0;
            }

            int max_remainderby10 = 147483647;

            if(Integer.parseInt(reversed.substring(1)) > max_remainderby10){
                return 0;
            }
        }
        return Integer.parseInt(reversed)*sign;
    }

    public int reverse2(int x) {
        int sign;
        if(x >= 0){
            sign = 1;
        }
        else sign = -1;
        x = x*sign;
        //String reversed = new StringBuilder(Integer.toString(x*sign)).reverse().toString();

        if(x > 999999999){
            if(x%10 > 2){
                return 0;
            }
            else {
                int reversed = 0;
                int x2 = x % 1000000000;
                int x2_f = x/1000000000;
                while (x2>0){
                    reversed = reversed*10 + x2%10;
                    x2/=10;
                }
                if(reversed > 147483647){
                    return 0;
                }
                else {

                }
            }
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
        System.out.println(obj.reverse2(1599999999));
        System.out.println(obj.reverse2(1493847412));
        System.out.println(obj.reverse2(-123456789));
        System.out.println(obj.reverse2(987654321));
        System.out.println(obj.reverse2(123456789));
        System.out.println(obj.reverse2(123));
        System.out.println(obj.reverse2(0));
        System.out.println(obj.reverse2(-12313));
        System.out.println(obj.reverse2(-2147483412));
    }                                      // 2143847412
}                                          // 2147483647
                                            // 147483647
