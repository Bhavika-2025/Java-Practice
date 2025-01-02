package arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class operations_arraylist {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        //add elements
        list.add(10);
        list.add(25);
        list.add(30);
        list.add(15);
        list.add(20);
        list.add(35);
        System.out.println(list);

        //get elements
        int element = list.get(3);
        System.out.println(element);

        //add element at particular index
        list.add(4, 0);
        System.out.println(list);

        //set element 
        list.set(4, 10);
        System.out.println(list);

        //delete the element
        list.remove(4);
        System.out.println(list);

        //size
        System.out.println(list.size());

        //loops
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println();

        //sorting
        Collections.sort(list);
        System.out.println(list);
    }

}
