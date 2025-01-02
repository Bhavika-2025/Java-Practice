package LL;

import java.util.*;

public class using_java {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.addLast("Loser");
        System.out.println(list);
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("Bhavika");
        System.out.println(list);

        System.out.println(list.size());

        list.removeFirst();
        list.removeLast();
        System.out.println(list);
        System.out.println(list.size());
    }

}
