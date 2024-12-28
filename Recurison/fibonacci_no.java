package recursion;

public class fibo {

    public static void printfibo(int a, int b, int n) {
        if (n == 0) {
            return;
        }
        System.out.println(a);
        printfibo(b, a + b, n - 1);
    }

    public static void main(String[] args) {
        printfibo(0, 1, 5);
    }
}
