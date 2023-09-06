public class Solution6 {
    public String convert(String s, int numRows) {
        StringBuilder[] matrix = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            matrix[i] = new StringBuilder();
        }
        int i, c=0;
        while(c < s.length()){
            i=0;
            while(i < numRows && c < s.length()) {
                matrix[i++].append(s.charAt(c++));
            }
            i = numRows-2;
            while(i > 0 && c < s.length()){
                matrix[i--].append(s.charAt(c++));
            }
        }
        StringBuilder str = new StringBuilder();
        for(StringBuilder sb: matrix){
            str.append(sb);
        }
        return str.toString();
    }

    public static void main(String[] args) {
        System.out.println(new Solution6().convert("PAYPALISHIRING",3));
    }
}
