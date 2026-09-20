import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int z = scanner.nextInt();
            // Your code goes here
            int c = ((y*10)/z)+((x*5)/z);
            int f = (((y*10)%z)+((x*5)%z))/z;
            System.out.println(c+f);
        }
    }
}
