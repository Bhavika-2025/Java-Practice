package functions_methods;

// import java.util.Scanner;
public class age_limit_vote {

    // public static void vote(int age) {
    //     if (age > 18) {
    //         System.out.println("They can vote.");
    //     } else {
    //         System.out.println("Cannot vote below 18.");
    //     }
    // }
    public static void main(String[] args) {
        // System.out.println("Enter the radius");
        // Scanner sc = new Scanner(System.in);
        // int age = sc.nextInt();
        // vote(age);
        int i = 16;
        for (; i > 0 i >>= 1) {
            if (i == 5) {
                System.out.println("hello");
                break;
            }

            System.out.println(i + " ");
        }
    }
}
