package arrays;

import java.util.*;

public class search_no_array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int n = sc.nextInt();
        int search_nos[] = new int[n];

        System.out.println("Enter the array ");
        for (int i = 0; i < n; i++) {
            search_nos[i] = sc.nextInt();
        }

        System.out.println("Number to search ");
        int search = sc.nextInt();
        System.out.println("Number is at index ");
        for (int i = 0; i < n; i++) {
            if (search == search_nos[i]) {
                System.out.println(i);
            } else {
                System.out.println("Number doesn't exist");
            }
        }
    }
}
