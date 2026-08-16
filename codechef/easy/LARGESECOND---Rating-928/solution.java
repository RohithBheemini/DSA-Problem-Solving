import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            // Your code goes here
            int l = Integer.MIN_VALUE;
            int sl=Integer.MIN_VALUE;
            for( int num : a){
                if(num>l){
                    sl=l;
                    l=num;
                }
                else if(num>sl && num!=l){
                    sl=num;
                }
            }
            System.out.println(sl+l);
        }
    }
}
