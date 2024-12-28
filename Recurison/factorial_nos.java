package recursion;

public class factorial_nos {

    private static void factorial(int n, int pdt) {
        if (n == 0) {
            System.out.println(pdt);
            return;
        }

        pdt *= n;
        factorial(n - 1, pdt);

    }

    public static void main(String[] args) {
        factorial(5, 1);
    }

}
