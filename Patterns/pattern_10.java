
import java.util.Scanner;

public class pattern_10 {

    public static void main(String[] args) {
        System.out.println("Enter the nos");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= n; k++) {
                System.out.print("*");
            }
            System.out.println();

        }
        sc.close();
    }
}
