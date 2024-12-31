package recursion;

public class occurance_of_string {

    public static int first = -1;
    public static int last = -1;

    public static void occurance(String str, int idx, char element) {

        if (idx == str.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }

        char currentChar = str.charAt(idx);

        if (currentChar == element) {
            if (first == -1) {
                first = idx;
            } else {
                last = idx;
            }
        }

        occurance(str, idx + 1, element);

    }

    public static void main(String[] args) {
        String str = "abaacadaefaah";

        occurance(str, 0, 'a');

    }

}
