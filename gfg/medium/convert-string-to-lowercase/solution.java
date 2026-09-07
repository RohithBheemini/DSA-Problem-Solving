class Solution {
    static String toLower(String s) {
        // code here
        StringBuilder string_builder = new StringBuilder(s);
                for(int u = 0; u<s.length(); u++){
                    if(s.charAt(u) >= 'A' && s.charAt(u) <= 'Z'){
                        string_builder.setCharAt(u, (char) (s.charAt(u) + 32));
                    }
                }
                return string_builder.toString();
    }
}