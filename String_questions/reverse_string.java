package string_based_questions;

public class reverse_string {

    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Hello");

        for (int i = 0; i < str.length() / 2; i++) {
            int front = i;
            int back = str.length() - i - 1;

            char backchar = str.charAt(back);
            char frontchar = str.charAt(front);

            str.setCharAt(front, backchar);
            str.setCharAt(back, frontchar);
        }
        System.out.println(str);

    }
}
