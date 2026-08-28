class Solution {
    int factorial(int n) {
        // code here
        if(n<0) return 0;
        if(n==0) return 1;
        int k=1;
        int f=1;
        while(k++<n){
            f*=k;
        }
        return f;
    }
}
