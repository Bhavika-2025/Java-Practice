package bit_manipulation;

public class set_bit {

    public static void main(String[] args) {

        int n = 5;
        int pos = 1;
        int bitmast = 1 << pos;

        int newNumber = bitmast | n;
        System.out.println(newNumber);
    }
}
