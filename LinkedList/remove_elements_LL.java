package LL;

import java.util.LinkedList;
import java.util.Scanner;

public class remove_elements_LL {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();

        System.out.println("Enter the number ");

        while (true) {
            int num = sc.nextInt();
            if (num == -1) {
                break;
            }
            if (num >= 1 && num <= 50) {
                list.add(num);
            } else {
                System.out.println("enther the number betwen 1 to 50");
            }
        }

        System.out.println(list);

        int i = 0;
        while (i < list.size()) {
            if (list.get(i) > 25) {
                list.remove(i);
            } else {
                i++;
            }
        }

        System.out.println(list);
    }
}
