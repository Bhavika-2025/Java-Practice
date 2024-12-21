package string_based_questions;

public class replace_string {

    public static void main(String[] args) {
        String str = "Hello, Wered!";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') {
                result += 'i';
            } else {
                result += str.charAt(i);
            }
        }
        System.out.println(result);
    }
}
