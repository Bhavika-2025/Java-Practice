package bit_manipulation;

public class get_bit_mani {

    public static void main(String[] args) {
        int n = 5;
        int pos = 2;
        int bitmast = 1 << pos;

        if ((bitmast & n) == 0) {
            System.out.println("Bit is zero");
        } else {
            System.out.println("Bit is One");
        }
    }
}
