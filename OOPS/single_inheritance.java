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

public class single_inheritance {

    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.color = "Blue";
        t1.area();

    }
}
