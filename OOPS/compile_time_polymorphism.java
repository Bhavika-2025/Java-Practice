package OOPS;

class Student {

    String name;
    int age;

    public void printInfo1(int age) {
        System.out.println(age);
    }

    public void printInfo1(String name) {
        System.out.println(name);
    }

    public void printInfo1(int age, String name) {
        System.out.println("name" + name + " age" + age);
    }
}

public class compile_time_polymorphism {

    public static void main(String[] args) {

        Student s = new Student();
        s.name = "Bhavika";
        s.age = 21;

        s.printInfo1(s.age);
        s.printInfo1(s.name);
        s.printInfo1(s.age, s.name);
    }
}
