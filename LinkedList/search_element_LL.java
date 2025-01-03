package LL;

import java.util.LinkedList;
import java.util.Scanner;

public class search_element_LL {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(5);
        list.add(7);
        list.add(3);
        list.add(8);
        list.add(2);
        list.add(3);
        System.out.println(list);
        System.out.println("Search the element");
        int num = sc.nextInt();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == num) {
                System.out.println("Element" + num + "found at index " + i);
            }
        }
        sc.close();
    }

}
