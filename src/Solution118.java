import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

class Solution118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascalt = new ArrayList<>();
        for(int i=0; i<numRows; i++){
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                list.add(getNCR(i,j).intValue());
            }
            pascalt.add(list);
        }
        return pascalt;
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
        Solution118 s = new Solution118();
        for (int i = 0; i < 15; i++) {
            System.out.println(s.fact(i));
        }
        System.out.println(s.generate(30).get(29));
    }
}