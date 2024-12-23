package string_based_questions;

public class remove_white_spaces {

    public static void main(String[] args) {
        String str = "   H e l  l   0";
        System.out.println(str.replaceAll("\\s", ""));
    }
}
