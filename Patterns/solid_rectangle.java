
import java.util.Scanner;

public class solid_rectangle {

    public static void main(String[] args) {

        System.out.println("Enter the nos");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
        sc.close();
    }
}
