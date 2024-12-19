package functions_methods;

import java.util.Scanner;

public class circumference_of_circle {

    public static double circumference(double r) {
        return 2 * Math.PI * r;
    }

    public static void main(String[] args) {
        System.out.println("Enter the radius");
        Scanner sc = new Scanner(System.in);
        double r = sc.nextInt();
        System.out.println("Circumference of the circle is " + circumference(r));
    }
}
