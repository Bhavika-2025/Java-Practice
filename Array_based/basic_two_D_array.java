package arrays;

import java.util.Scanner;

public class basic_two_D_array {

    public static void main(String[] args) {

        //simple 2d array print 
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
        System.out.println("Number to search");

        //search a number from array
        int x = sc.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (number[i][j] == x) {
                    System.out.println("Number found at posititon" + " (" + i + "," + j + ")");
                }
                // System.out.print(number[i][j] + " ");  
            }
        }

    }
}
