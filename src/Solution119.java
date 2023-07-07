import java.util.*;
import java.math.BigInteger;

class Solution119 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        for (int j = 0; j <= rowIndex; j++) {
            list.add(getNCR(rowIndex,j).intValue());
        }
        return list;
    }
    BigInteger getNCR(int n, int r){
        return fact(n).divide(fact(n-r).multiply(fact(r)));
    }
    BigInteger fact(int a){
        if(a==0)
            return new BigInteger("1");
        else return new BigInteger(a+"").multiply(fact(a-1));
    }

    public static void main(String[] args) {
        System.out.println(new Solution119().getRow(3));
    }
}