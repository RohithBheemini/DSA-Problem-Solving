class Solution {
    public String longest(String[] arr) {
        // code here
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i].length()>arr[index].length()){
                index=i;
            }
        }
        return arr[index];
    }
}