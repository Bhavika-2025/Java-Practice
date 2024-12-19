package functions_methods;

import java.util.Scanner;

public class average {

    public static int average_two_nos(int a, int b, int c, int n) {

        return (a + b + c) / n;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Total numbers");
        int n = sc.nextInt();
        System.out.println("Enter the numbers ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int averageoftwonos = average_two_nos(a, b, c, n);
        System.out.println(averageoftwonos);
    }
}
