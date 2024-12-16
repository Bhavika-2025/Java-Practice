
import java.util.Scanner;

public class pattern_11 {

    public static void main(String[] args) {
        System.out.println("Enter the nos");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();

        }
        sc.close();
    }
}
