package string_based_questions;

public class remove_special_char {

    public static void main(String[] args) {
        String str = "@#$bh$%avI*";
        System.out.print(str.replaceAll("[^a-zA-Z0-9]", ""));
    }
}
