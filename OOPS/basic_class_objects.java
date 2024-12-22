package OOPS;

class Pen {

    String color;
    String type;

    public void write() {
        System.out.println("Writing with something");
    }

    public void printColor() {
        System.out.println(this.color);
    }
}

public class basic_class_objects {

    public static void main(String[] args) {

        Pen pen1 = new Pen();
        pen1.color = "Yellow";
        pen1.type = "Ballpoint";

        Pen pen2 = new Pen();
        pen2.color = "Green";

        pen1.printColor();
        pen2.printColor();
        pen1.write();

    }
}
