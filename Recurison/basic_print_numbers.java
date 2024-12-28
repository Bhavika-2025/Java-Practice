package recursion;

public class basic_print_numbers {

    //print number 5 - 1
    // public static void printnum(int n) {
    //     if (n == 0) {
    //         return;
    //     }
    //     System.out.println(n);
    //     printnum(n - 1);
    // }
    //print number 1 - 5
    public static void printnum1(int m) {
        if (m >= 6) {
            return;
        }
        System.out.println(m);
        printnum1(m + 1);
    }

    public static void main(String[] args) {
        // int n = 5;
        int m = 1;
        // printnum(n);

        System.out.println("Second printing ");
        printnum1(m);
    }
}
