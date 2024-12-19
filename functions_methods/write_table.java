package functions_methods;

import java.util.Scanner;

public class write_table {

    public static void table_Print(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " X " + i + " = " + n * i);
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the number ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        table_Print(n);
    }
}
