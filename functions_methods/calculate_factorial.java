package functions_methods;

import java.util.Scanner;

public class calculate_factorial {

    public static int factorialcal(int n) {
        int pdt = 1;
        for (int i = 1; i <= n; i++) {
            pdt = pdt * i;
        }
        return pdt;
    }

    public static void main(String[] args) {
        System.out.println("Enter the no ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int factorial = factorialcal(n);
        System.out.println(factorial);
    }
}
