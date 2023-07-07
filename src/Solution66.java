import java.math.BigInteger;

class Solution66 {
    public int[] plusOne(int[] digits) {
        StringBuilder n = new StringBuilder();
        for(int a:digits){
            n.append(a);
        }

        BigInteger bignum = new BigInteger(n.toString());
        bignum = bignum.add(new BigInteger("1"));
        int length = bignum.toString().length();

        int[] arr = new int[length];

        for(int i=0; i<length; i++){
            arr[i] = Character.getNumericValue(bignum.toString().charAt(i));
        }
        return arr;
    }

    public static void main(String[] args) {

    }
}