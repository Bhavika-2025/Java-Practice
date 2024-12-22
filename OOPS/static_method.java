package OOPS;

class Student {

    String name;
    static String schoool;
}

public class static_method {

    public static void main(String[] args) {
        Student.schoool = "Rachana Vidyalaya";

        Student s1 = new Student();
        s1.name = "Bhavika";
        System.out.println(s1.schoool);
    }

}
