package string_based_questions;

// import java.util.Scanner;
public class reverse_string {

    public static void main(String[] args) {

        //1st way
        String str = "Hello";
        char[] chArr = str.toCharArray();
        for (int i = chArr.length - 1; i >= 0; i--) {
            System.out.print(chArr[i]);
        }
        System.out.println();

        //2nd Way
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
        System.out.println();

        //3rd way
        StringBuffer sb = new StringBuffer(str);
        System.out.print(sb.reverse());

        StringBuilder str1 = new StringBuilder("Hello");
        for (int i = 0; i < str.length() / 2; i++) {
            int front = i;
            int back = str1.length() - i - 1;
            char frontchar = str1.charAt(front);
            char backchar = str1.charAt(back);
            str1.setCharAt(front, backchar);
            str1.setCharAt(back, frontchar);
        }
    }
}
