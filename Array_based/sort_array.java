package arrays;

import java.util.Scanner;

public class sort_array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter the array ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        boolean isAscending = true;
        // System.out.println("Check array is sorted or not");
        for (int i = 0; i < size - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isAscending = false;
            }
        }

        if (isAscending) {
            System.out.println("Array is already sorted");
        } else {
            System.out.println("Array is not sorted");
        }
    }
}
