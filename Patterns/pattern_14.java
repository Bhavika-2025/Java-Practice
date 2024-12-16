
import java.util.Scanner;

public class pattern_14 {

    public static void main(String[] args) {
        System.out.println("Enter the nos");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            //spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            //first part
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            //second part
            for (int j = 2; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
            sc.close();
        }

        for (int i = n; i >= 1; i--) {
            //spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            //first part
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            //second part
            for (int j = 2; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
            sc.close();
        }
    }
}
