package arrays;

import java.util.Scanner;

public class transpose_array {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows and cols ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] number = new int[rows][cols];
        System.out.println("Enter the 2D array  ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                number[i][j] = sc.nextInt();
            }
        }
        System.out.println("print array");
        for (int j = 0; j < cols; j++) {

            for (int i = 0; i < rows; i++) {
                System.out.print(number[i][j] + " ");
            }
            System.out.println();
        }

    }
}
