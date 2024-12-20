package arrays;

import java.util.*;

public class simple_Problem_array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] Array = new int[3];
        System.out.println("Enter the array");
        for (int i = 0; i < 3; i++) {
            Array[i] = sc.nextInt();
        }
        System.out.println("Print the array");
        for (int i = 0; i < 3; i++) {
            System.out.println(Array[i]);
        }

    }
}
