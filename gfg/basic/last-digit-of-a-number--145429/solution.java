import java.util.*;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // code here
        if(n>=0)System.out.print(n%10);
        else System.out.print(-n%10);
    }
}