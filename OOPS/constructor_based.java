package OOPS;

class Student {

    String name;
    int age;

    //Non - Parameterized Constructor
    Student() {
        System.out.println("Non - Parameterized constructor");
    }

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    //Parameterized Constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //copy constructor
    Student(Student s2) {
        this.name = s2.name;
        this.age = s2.age;
    }
}

public class constructor_based {

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s3 = new Student("Bhavika", 20);
        Student s = new Student();
        s.name = "Bhavika";
        s.age = 20;
        s.printInfo();
        Student s2 = new Student(s);
    }
}
