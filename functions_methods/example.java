package functions_methods;

import java.util.LinkedList;
import java.util.List;

public class example {

    public static void main(String[] args) {
        List<String> list1 = new LinkedList<>();
        list1.add("One");

        list1.add("Two");

        list1.add("OneThree");

        list1.add("Three");

        list1.add("One");

        List<String> list2 = new LinkedList<>();
        list2.add("One");

        list1.removeAll(list2);
        for (String item : list1) {
            System.out.print(item + " ");
        }
    }
}
