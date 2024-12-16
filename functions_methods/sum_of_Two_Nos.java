package functions_methods;

import java.util.Scanner;

public class sum_of_Two_Nos {

    public static int sum_of_Two_numbers(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.print("Enter the two numbers --> ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = sum_of_Two_numbers(a, b);
        System.out.println(sum);
    }
}
