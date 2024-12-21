package string_based_questions;

import java.util.*;

public class array_based_string {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String[] arr = new String[size];
        int t_length = 0;
        for (int i = 0; i < size; i++) {
            arr[i] = sc.next();
            t_length += arr[i].length();

        }
        System.out.println(t_length);
        sc.close();
    }
}
