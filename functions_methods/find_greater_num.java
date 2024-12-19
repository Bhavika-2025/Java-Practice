package functions_methods;

import java.util.Scanner;

public class find_greater_num {

    public static int greater(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        }
        return num2;
    }

    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("The gretaer number is = " + greater(num1, num2));
    }
}
