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

class Equilateraltriangle extends Triangle {

    int side;
}

public class multi_level_inheritance {

}
