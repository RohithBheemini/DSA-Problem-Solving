class Solution {
    public static int[] lcmAndGcd(int a, int b) {
        // code here
        if(a<b){
            int temp =a;
            a=b;
            b=temp;
        }
        int m=a;
        int n=b;
        while(b!=0){
            int temp = b;
            b=a%b;
            a=temp;
        }
        int gcd=a;
        int lcm = (m*n)/gcd;
        return new int[]{lcm,gcd};
    }
}