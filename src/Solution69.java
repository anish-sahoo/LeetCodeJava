class Solution69 {
    public int mySqrt(int x) {
        if(x < 2){
            return x;
        }
        int left = 0, right = x, mid=0;
        while (left<right){
            mid = (left+right+1)/2;
            if(mid*mid == x){
                return mid;
            }
            if(mid*mid >= x){
                right = mid-1;
            }
            else left = mid;
        }
        return left;
    }

    public static void main(String[] args) {
        System.out.println("sqrt(1) = "+new Solution69().mySqrt(1));
        System.out.println("sqrt(4) = "+new Solution69().mySqrt(4));
        System.out.println("sqrt(7) = "+new Solution69().mySqrt(7));
        System.out.println("sqrt(8) = "+new Solution69().mySqrt(8));
        System.out.println("sqrt(64) = "+new Solution69().mySqrt(64));
        System.out.println("sqrt(70) = "+new Solution69().mySqrt(70));
        System.out.println("sqrt(81) = "+new Solution69().mySqrt(81));
        System.out.println("sqrt(90) = "+new Solution69().mySqrt(90));
        System.out.println("sqrt(2147395599) = "+new Solution69().mySqrt(2147395599));

    }
}
