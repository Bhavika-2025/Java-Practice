package recursion;

public class x_pow_n {

    public static int printPower(int x, int n) {
        if (x == 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        int x_ = printPower(x, n - 1);
        int xn = x * x_;
        return xn;
    }

    public static void main(String[] args) {
        int x = 2, n = 5;
        int result = printPower(x, n);
        System.out.println(result);
    }
}
