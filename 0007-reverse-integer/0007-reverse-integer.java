class Solution {
    public int reverse(int x) {
        int temp = x;
        int rev=0;
        int negflag=0;
        int digit =0;
        if(x < Integer.MIN_VALUE || x > Integer.MAX_VALUE){
            return 0;
        }
        if(temp<0){
            temp=-temp;
            negflag =1;
        }
        while(temp>0){
            digit = temp%10;
            if(rev>(Integer.MAX_VALUE-digit)/10){
                return 0;
            }
            rev = rev*10 + digit;
            temp/=10;
        }
        if(negflag==1){
            return -rev;
        }
        return rev;
    }
}