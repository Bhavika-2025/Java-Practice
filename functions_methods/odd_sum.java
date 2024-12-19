package functions_methods;

import java.util.Scanner;

public class odd_sum {

    public static int sum_of_odd(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("enter the number n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(sum_of_odd(n));
    }
}
