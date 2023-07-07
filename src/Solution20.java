class Solution20 {
    public boolean isValid(String s) {
        while(s.contains("()") || s.contains("{}") || s.contains("[]")){
            s = s.replace("()","");
            s = s.replace("{}","");
            s = s.replace("[]","");
        }
        return s.length()==0;
    }

    public static void main(String[] args) {
        System.out.println(new Solution20().isValid("()[]{}"));
    }
}
