class Solution {
    public static boolean isPalinArray(int[] arr) {
        // code here.
        for(int i=0;i<arr.length;i++){
            int rev=0;
            int temp=arr[i];
            while(temp>0){
                int d=temp%10;
                rev=rev*10+d;
                temp/=10;
            }
            if(rev!=arr[i]){
                return false;
            }
        }
        return true;
    }
}