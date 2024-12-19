package functions_methods;

import java.util.Scanner;

public class find_Even_nos {

    public static boolean find_even(int num) {
        return num % 2 == 0;
    }

    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        boolean check = find_even(num);
        System.out.println(check);
    }
}
