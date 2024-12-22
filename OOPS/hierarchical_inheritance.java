package OOPS;

class Shape {

    String color;

    public void area() {
        System.out.println("Color of shape is " + color);
    }
}

class Triangle extends Shape {

    public void area(int b, int h) {
        System.out.println((1 / 2) * b * h);
    }
}

class Circle extends Shape {

    public void area(int r) {
        System.out.println(3.14 * r * r);
    }
}

public class hierarchical_inheritance {

    public static void main(String[] args) {

    }
}
