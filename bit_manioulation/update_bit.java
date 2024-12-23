package bit_manipulation;

import java.util.Scanner;

public class update_bit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();
        int n = 5;
        int pos = 1;
        int bitmast = 1 << pos;

        if (oper == 1) {
            int newNumber = bitmast | n;
            System.out.println(newNumber);
        } else {
            int newNumber = (~bitmast) & n;
            System.out.println(newNumber);
        }
    }
}
