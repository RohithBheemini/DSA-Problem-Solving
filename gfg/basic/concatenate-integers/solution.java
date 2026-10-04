import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        // code here
        int c;
        if(a<10) c=a*10+b;
        else if(a>=10 && a<100) c=a*100+b;
        else c=a*1000+b;
        System.out.print(c);
    }
}