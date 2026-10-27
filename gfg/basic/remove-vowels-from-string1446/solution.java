class Solution {
    String removeVowels(String s) {
        // code here
        StringBuilder ss=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='a'&&s.charAt(i)!='e'&&s.charAt(i)!='i'&&s.charAt(i)!='o'&&s.charAt(i)!='u'){
                ss.append(s.charAt(i));
            }
        }
        return ss.toString();
    }
}