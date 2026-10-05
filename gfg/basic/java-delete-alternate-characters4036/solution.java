class Solution {
    static String delAlternate(String s) {
        // code here
        String sd="";
        for(int i=0;i<s.length();i+=2){
            sd+=s.charAt(i);
        }
        return sd;
    }
}