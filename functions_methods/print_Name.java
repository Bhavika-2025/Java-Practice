package functions_methods;

import java.util.Scanner;

public class print_Name {

    public static void printName(String name) {
        System.out.println(name);
    }

    public static void main(String[] args) {
        System.out.println("Enter the name");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        printName(name);
    }
}
