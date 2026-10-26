class Solution {
    int firstOccurence(String txt, String pat) {
        // code here
        for(int i=0;i<txt.length();i++){
            for(int j=0;j<pat.length();j++){
                if((i+j)>txt.length()-1){
                    return -1;
                }
                if(txt.charAt(i+j)!=pat.charAt(j)){
                    break;
                }
                if(j==pat.length()-1){
                    return i;
                }
            }
        }
        return -1;
    }
}