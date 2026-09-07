class Solution {
    public static String reverseString(String s) {
        // code here
        String s2="";
        for(int i=s.length()-1;i>=0;i--){
            s2+=s.charAt(i);
        }
        return s2;
    }
}