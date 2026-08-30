class Solution {
    public void rotate(int[] arr) {
        // code here
        int n=arr.length;
        int k = arr[n-1];
        while(n>1){
            arr[n-1]=arr[n-2];
            n--;
        }
        arr[0]=k;
    }
}