package functions_methods;

import java.util.Scanner;

public class find_prime_Num {

    public static boolean find_Prime(int num) {
        if (num == 0 || num == 1) {
            System.out.println("Not a Prime");
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        boolean number = find_Prime(num);
        System.out.println(number);
    }
}
