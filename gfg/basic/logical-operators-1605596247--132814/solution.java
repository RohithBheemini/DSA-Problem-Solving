class Solution {
    public String booleanOperations(boolean a, boolean b) {
        // Code here
        String str= "";
        str+=a&&b;
        str+=" ";
        str+=a||b;
        str+=" ";
        str+=!a;
        return str;
    }
}