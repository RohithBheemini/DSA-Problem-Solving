class Solution {
    public static int largest(int[] arr) {
        // code here
        int l = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>l) l=arr[i];
        }
        return l;
    }
}
