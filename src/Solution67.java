public class Solution67 {
    public String addBinary(String a, String b) {
        String sum = "";
        int carry = 0;

        while (a.length() != b.length()){
            if(a.length() < b.length()){
                a = "0"+a;
            }
            else b = "0"+b;
        }

        for(int i=a.length()-1; i>=0; i--){
            int n_a = Integer.parseInt(a.substring(i,i+1));
            int n_b = Integer.parseInt(b.substring(i,i+1));
            if(n_a + n_b + carry > 2){
                sum = "1" + sum;
                carry = 1;
            }
            else if(n_a + n_b + carry < 2){
                sum = (n_a + n_b + carry) + sum;
                carry = 0;
            }
            else{
                sum = "0" + sum;
                carry = 1;
            }
        }
        if(carry > 0){
            sum = carry + sum;
        }
        return sum;
    }
}
